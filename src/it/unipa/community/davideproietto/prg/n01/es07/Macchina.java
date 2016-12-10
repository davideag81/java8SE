package it.unipa.community.davideproietto.prg.n01.es07;

public class Macchina {
	private String targa = ("da immpatricolare");

	public Macchina(String targa) {
		Ruota aDx = new Ruota();
		Ruota aSx = new Ruota();
		Ruota pDx = new Ruota();
		Ruota pSx = new Ruota();
		
		this.targa = targa;
	}

	public Macchina() {
		this("targa");
	}
	
	public void monitora(Ruota r){
	  	System.out.println("La pressione della ruota è : "+ r.getPressione() + "  mmbar");
	}

	public void monitora(){
	  	System.out.println("La pressione di tutte le ruote è : "+ aSx.getPressione() + "  mmbar"+
	  															"\n"+ aDx.getPressione + "  mmbar"+
	  															"\n"+ pSx.getPressione + "  mmbar"+
	  															"\n"+ pDx.getPressione + "  mmbar"+
	  															);
	}
}
