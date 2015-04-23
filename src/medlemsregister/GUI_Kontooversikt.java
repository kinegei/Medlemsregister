package medlemsregister;

import javax.swing.*;
import java.awt.*;

public class GUI_Kontooversikt extends JFrame{
	
	int id;
	
	GUI_Kontooversikt(int id){
		this.id = id;
		

	}
	public void settVindu(){
		setDefaultCloseOperation(GUI_Kontooversikt.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton kn = new JButton("Trykk");
		add(kn);
		
		
		setSize(500, 600);
		setVisible(true);
	}
}
