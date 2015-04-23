package medlemsregister;

import java.util.Date;

abstract class Aktor { // for a sjekke
	int medlemsnummer;
	
	String namn;
	String etternamn;
	
	String adr;
	String postnr;
	String poststed;
	
	String mailadr1;
	String mailadr2;
	
	String tlf1;
	String tlf2;
	
	//Date fdato;
	String fdato;
	
	String fritekst;
	
	KontoOversikt konto;
	
	
	Aktor(String na, String et, String adr, String postnr, String poststed, String fdato, String tlf1, String tlf2, String ma1, String ma2, String fritekst){
		namn = na;
		etternamn = et;
		
		this.adr = adr;
		this.postnr = postnr;
		this.poststed = poststed;
		
		mailadr1 = ma1;
		mailadr2 = ma2;
		
		this.tlf1 = tlf1;
		this.tlf2 = tlf2;
		this.fdato = fdato;
		//this.fdato = fdato;
		
		this.fritekst = fritekst; 
	}
	

}
