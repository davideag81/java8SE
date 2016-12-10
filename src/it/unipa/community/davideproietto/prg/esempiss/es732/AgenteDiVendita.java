package it.unipa.community.davideproietto.prg.esempiss.es732;

public class AgenteDiVendita extends Dipendente {
private String [] PortafoglioClienti;
private int provvigioni;
public String[] getPortafoglioClienti() {
	return PortafoglioClienti;
}
public void setPortafoglioClienti(String[] portafoglioClienti) {
	PortafoglioClienti = portafoglioClienti;
}
public int getProvvigioni() {
	return provvigioni;
}
public void setProvvigioni(int provvigioni) {
	this.provvigioni = provvigioni;
}


}
