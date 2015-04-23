package oldTests;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Klasse extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3199684044002786248L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField knutFelt;
	private JLabel lblEtternavn;
	private JTextField textField_2;
	private JButton btnLagre;
	private JButton btnAvbryt;
	private JCheckBox chckbxNewCheckBox;
	private final Action action = new SwingAction();
	private JButton btnNyeKnappen;
	private JTextField textField_1;
	private JLabel lblAdresse_1;
	private JTextField textField_3;
	private JLabel lblNewLabel;
	private JLabel lblAdresse_2;
	private JTextField textField_4;
	private JLabel lblPostnummer;
	private JTextField textField_5;
	private JLabel lblPoststed;
	private JTextField textField_6;
	private JLabel lblEpost;
	private JTextField textField_7;



	/**
	 * Create the frame.
	 */
	public Klasse() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNavn = new JLabel("Navn");
		contentPane.add(lblNavn, "2, 2, right, default");
		
		textField = new JTextField();
		contentPane.add(textField, "4, 2, fill, default");
		textField.setColumns(10);
		
		lblEtternavn = new JLabel("Ledig 1");
		contentPane.add(lblEtternavn, "6, 2, right, default");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "8, 2, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Etternavn");
		contentPane.add(lblAdresse, "2, 4, right, default");
		
		knutFelt = new JTextField();
		contentPane.add(knutFelt, "4, 4, fill, default");
		knutFelt.setColumns(10);
		
		btnLagre = new JButton("Lagre");
		btnLagre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("trykket pa knappen");
			}
		});
		
		btnNyeKnappen = new JButton("Nye knappen");
		btnNyeKnappen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("den andre lille knappen er trykka");
			}
		});
		
		lblAdresse_1 = new JLabel("Adresse 1");
		contentPane.add(lblAdresse_1, "2, 6, right, default");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "4, 6, fill, default");
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("Adresse 2");
		contentPane.add(lblNewLabel, "2, 8, right, default");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "4, 8, fill, default");
		textField_3.setColumns(10);
		
		lblAdresse_2 = new JLabel("Adresse 3");
		contentPane.add(lblAdresse_2, "2, 10, right, default");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "4, 10, fill, default");
		textField_4.setColumns(10);
		
		lblPostnummer = new JLabel("Postnummer");
		contentPane.add(lblPostnummer, "2, 12, right, default");
		
		textField_5 = new JTextField();
		contentPane.add(textField_5, "4, 12, fill, default");
		textField_5.setColumns(10);
		
		lblPoststed = new JLabel("Poststed");
		contentPane.add(lblPoststed, "2, 14, right, default");
		
		textField_6 = new JTextField();
		contentPane.add(textField_6, "4, 14, fill, default");
		textField_6.setColumns(10);
		
		lblEpost = new JLabel("E-post");
		contentPane.add(lblEpost, "2, 16, right, default");
		
		textField_7 = new JTextField();
		contentPane.add(textField_7, "4, 16, fill, default");
		textField_7.setColumns(10);
		contentPane.add(btnNyeKnappen, "4, 22");
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setAction(action);
		contentPane.add(chckbxNewCheckBox, "8, 22");
		contentPane.add(btnLagre, "4, 26");
		
		btnAvbryt = new JButton("Avbryt");
		btnAvbryt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnAvbryt, "8, 26");
		setVisible(true);//Legg til denne
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			knutFelt.setText(""+e.getSource());
		}
	}
}
