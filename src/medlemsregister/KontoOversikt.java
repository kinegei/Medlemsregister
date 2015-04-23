package medlemsregister;

import java.util.LinkedList;

public class KontoOversikt {
	LinkedList<Innbetaling> betalinger = new LinkedList<Innbetaling>();
	
	
	public void leggTilBetaling(Innbetaling inb){
		betalinger.add(inb);
	}
	
	public boolean sjekkBetalingAvInnbetalingstypeForAar(int aar, String innbetalingstype){
		for(Innbetaling innbet: betalinger){
			if(innbet.innbetalingstype.equals(innbetalingstype) && innbet.dato.getYear() == aar ){
				return true;
			}
		}
		return false;
	}
	
	
	
}
