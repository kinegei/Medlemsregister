package medlemsregister;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;


public class MainWindow extends JFrame{
	
	GridLayout grid;
	
	JPanel mainPanel;
	JButton knapp;
	
	Register reg;
	
	public MainWindow(Register r){
		reg = r;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Spires medlemsregister");
		
		setBounds(100, 100, 850, 500); // TODO: sett vinduet pa midten av skjermen
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(new FormLayout(new ColumnSpec[]{
			FormFactory.RELATED_GAP_COLSPEC,
			FormFactory.DEFAULT_COLSPEC,
			FormFactory.RELATED_GAP_COLSPEC,
			FormFactory.DEFAULT_COLSPEC,
			FormFactory.RELATED_GAP_COLSPEC,
			FormFactory.DEFAULT_COLSPEC,
			FormFactory.RELATED_GAP_COLSPEC,
			FormFactory.DEFAULT_COLSPEC,
			FormFactory.RELATED_GAP_COLSPEC,
			ColumnSpec.decode("default:grow"),},
		new RowSpec[] {
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC, //1
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC, //2
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC, //3
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC, //4
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//5
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//6
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//7
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//8
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//9
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//10
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//11
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//12
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//13
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//14
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//15
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//16
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//17
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//18
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//19
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//20
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//21
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//22
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//23
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//24
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//25
			FormFactory.RELATED_GAP_ROWSPEC,
			FormFactory.DEFAULT_ROWSPEC,//26
			FormFactory.RELATED_GAP_ROWSPEC}));

		String labelOriented = "left";
		int plassering = 0;
	
		String textFieldOriented = "right";
		int textFieldSize = 15;
		
		String[] aktInfo = {"Id", "Navn", "Etternavn", "Adresse", "Postnummer", "Poststed", "F¿dselsdato", "Tlf. nr. 1", "Tlf. nr. 2", "E-post 1", "E-post 2", "Fritekst"};
		String nameJlabel = "label";
		String nameJtextField = "textField";
		int kolloneplasseringLabel = 2;
		int kolloneplasseringTextF = 4;
		
		final JTextField[] textArr = new JTextField[aktInfo.length];
		
		for(int i = 0; i < aktInfo.length ; i++){
			System.out.println("\t her er det: " + aktInfo[i]);
			String nameJ = nameJlabel + i;
			System.out.println("\t\tNavnet er : " + nameJ);
			
			
			JLabel labeltekst = new JLabel(aktInfo[i]);
			mainPanel.add(labeltekst, "" + kolloneplasseringLabel + ", " + ((i*2)+2) + ", " + labelOriented + ", default");
			
			JTextField textfield = new JTextField(textFieldSize);
			mainPanel.add(textfield, "" + kolloneplasseringTextF + ", " + ((i*2)+2) + ", " + textFieldOriented + ", default");
			textArr[i] = textfield;
			
		}
		
		// Oppsett for velging av aktor type
		int plas = (aktInfo.length*2) + 4;
		JLabel velgAktor = new JLabel("Velg akt¿rtype: ");
		mainPanel.add(velgAktor, "2, "+ plas + ", left, default");
		String[] aktorType = {"Person", "Organisasjon", "Bedrift"};
		final JComboBox velgAkt = new JComboBox(aktorType);
		mainPanel.add(velgAkt, "4, "+ plas + ", right, default");
		
		
		// Knappane for search og lagring
		int plassen = (aktInfo.length*2) + 6;
		
		JButton search = new JButton("S¿k");
		JButton saveNew = new JButton("Lag Ny");
		mainPanel.add(search, "2, " + plassen + ", left, default");
		mainPanel.add(saveNew, "4, " + plassen + ", right, default");
		
		// ActionListener for Lagreknappen
		saveNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				// legge til sjekk om liknande person fins
				// legge til pop-up vindu med spm om du vil fortsette
				if(velgAkt.getSelectedItem().equals("Person")){
					Person p = new Person(textArr[1].getText(), textArr[2].getText(), textArr[3].getText(), textArr[4].getText(), textArr[5].getText(), textArr[6].getText(), textArr[7].getText(), textArr[8].getText(), textArr[9].getText(), textArr[10].getText(), textArr[11].getText());
					System.out.println("textArr[1].getText"+ textArr[1].getText()+"\np.name: " +p.namn);
					reg.leggtil(p);
				}
				//System.out.println("Akt¿rens getSelectedItem: "+ velgAkt.getSelectedItem());// selectedItemReminder
			}
		});
		
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("i searchen");
				reg.lagListe(textArr[1].getText());
			}
		});
		
		
		
		String[] knappeNavn = {"Kontooversikt", "Medlemsoversikt", "Vervoversikt"};
		final JButton[] knappar = new JButton[knappeNavn.length];
		int kolloneplasseringJButton = 8;
		
		
		// Lager de forskjellige knappene som skal Œpne mer informasjon om brukerene, som kontooversikt osv. 
		for(int j = 0; j < knappeNavn.length ; j++){
			
			knapp = new JButton(knappeNavn[j]);
			knappar[j] = knapp;
			mainPanel.add(knapp, "" + kolloneplasseringJButton + ", " + ((j*2)+2)+ ", right, default");
			knapp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					for(int t = 0; t < knappar.length ; t++){
						//System.out.println("kommet inn i for l¿kka til knappenavn");
						//System.out.println("Her er sourcen().toString(): " + e.getSource().toString());
						if(e.getSource().toString().contains(knappar[t].getText())){
							System.out.println("Knappens tekst er: " + e.getSource() + "\n\t og inne i knappar[] er det: " + knappar[t].getText());
							
							if(t == 0){
								visKontooversikt();
							}else if(t == 1){
								visMedlemsoversikt();
							}else if(t == 2){
								visVervoversikt();
							}
						
						}
								
					}
				}
			});
		}
		
		
		
		for(int t = 0; t < knappar.length ; t++){
			System.out.println("kommet inn i for l¿kka til knappenavn");
			if(knappar[t].getText().equals("Kontooversikt")){
				System.out.println("Knappens tekst er: " + knappar[t].getText());
			}
					
		}
		
		setSize(650, 600);
		setVisible(true);
	}
	
	public void visKontooversikt(){
		
		
	}
	public void visMedlemsoversikt(){
		
		
	}
	
	public void visVervoversikt(){
		
		
	}
	
}




