package medlemsregister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.sql.*;
import java.sql.*;
/**
 * Denne klassen er en beholder for alle personene. 
 * Alle personene skal kunne letes frem ved å søke på hva som helst av informasjon.
 * 
 * Kanskje eg kan lage ein hent/leit metode som er generisk, 
 * slik at det kan letes uavhengig av hvilken type som skal finnes??
 * 
 * Vil lage til sånn at man får opp alternativer mens man skriver inn det man søker etter. Men korleis? hum..
 * @author kinegjerstadeide
 *
 */

public class Register <T> {//<N extends Comparable<N>, V> {
	HashMap<Integer, Aktor> hmr = new HashMap<Integer, Aktor>(); 
	int hmrant = 0;

	Connection conn;

	//List<Person> liste = new ArrayList<Person>();  
	/**
	 * Legger til nye medlemmer som har brukt smsinnmelding
	 * @param e
	 * @param n
	 */
	public Register(){
		//
		// http://www.ayukucode.org/create-table-insert-query-with-jdbc-and-h2-database/
		// http://192.168.1.112:8082/login.jsp?jsessionid=fe7b411bb11f48f35c1bd89dc14ea8e8
		// lage forbindelse
		// sjekke om tabellen eksisterer
		// opprette
		//

		try{
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/medlemsregister", "sa", "Spire");

			Statement stat = conn.createStatement();

			stat.execute("CREATE TABLE IF NOT EXISTS PERSON (ID INTEGER auto_increment, NAMN VARCHAR(200), ETTERNAMN VARCHAR(200), ADR VARCHAR(200), POSTNR INTEGER, POSTSTED VARCHAR(200), TLF1 VARCHAR(100), TLF2 VARCHAR(100), MAIL1 VARCHAR(200), MAIL2 VARCHAR(200), FDATO VARCHAR(100), FRITEKST VARCHAR(200), PRIMARY KEY (ID))");

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public void leggtil(Aktor a){
		try{
			Statement addNew = conn.createStatement();

			addNew.execute("INSERT INTO PERSON(NAMN, ETTERNAMN, ADR, POSTNR, POSTSTED, MAIL1, MAIL2, TLF1, TLF2, FDATO, FRITEKST) VALUES ('"+a.namn+"', '"+a.etternamn+"', '"+a.adr+"', '"+a.postnr+"', '"+a.poststed+"', '"+a.mailadr1+"', '"+a.mailadr2+"', '"+a.tlf1+"', '"+a.tlf2+"', '"+a.fdato+"', '"+a.fritekst+"')");
			addNew.getGeneratedKeys();

			System.out.println("har lagt til Liste");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		hmr.put(hmrant, a);
		a.medlemsnummer = hmrant;
		hmrant ++;
		//System.out.println(hmrant+" har blitt lagt til");
	}


	public void lagListe(String s){
		try{
			Statement sta = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet r = sta.executeQuery("SELECT * FROM PERSON WHERE NAMN LIKE '%"+s+"%'"); 

			System.out.println("Før while");

			r.last();


			System.out.println(""+ r.getRow());



			boolean b = true;
			if(r.getRow() != 0){
				r.first();
				while(b){
					System.out.println("r.getString: "+r.getString("NAMN"));
					b = r.next();
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public List<Person> finnPerson(Aktor a){
		List<Person> lp = new LinkedList<Person>();
		for(Aktor akt: hmr.values()){
			if(a instanceof Person ){
			}	
		}
		/*}
		if(n.compareTo(p.namn)==0){
			return p;
		}else{
			finnPerson(p.nestepers, n);
		}*/
		return lp;
	}


	/**
	 * Ferdig: nei
	 * Denne skal hente en aktør fra HashMappet hmr på id-nummer og returnere dette
	 */

	/*public Aktor hent(int id){
		Aktor a = hmr.get(first);//new Person("ny");
		int first = 0;
		hmr.get(first);
		return a;
	}*/


	/**
	 * Ferdig: hasje pipling
	 * Avslutter tilkoblinga til databasen
	 */
	public void avsluttConn(){
		try{
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
