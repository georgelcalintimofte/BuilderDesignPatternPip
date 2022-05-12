package BuilderDesignPattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Title;

	public static void main(String[] args) {
					GUI frame = new GUI();
					frame.setVisible(true);
	}

	public GUI() {
		setTitle("Build your PC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Construirea de JComboBox-uri
		JComboBox<String> Case = new JComboBox<String>();
		Case.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Case.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select Case>", "Full Tower", "Mid Tower", "Mini Tower"}));
		Case.setSelectedIndex(0);
		Case.setBounds(40, 40, 200, 40);
		contentPane.add(Case);
		
		JComboBox<String> Motherboard = new JComboBox<String>();
		Motherboard.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select Motherboard>", "Micro-ATX", "ATX", "Extended-ATX"}));
		Motherboard.setSelectedIndex(0);
		Motherboard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Motherboard.setBounds(40, 100, 200, 40);
		contentPane.add(Motherboard);
		
		JComboBox<String> CPU = new JComboBox<String>();
		CPU.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CPU.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select CPU>", "Intel i3", "Intel i5", "Intel i7", "AMD Ryzen 9", "Intel i9"}));
		CPU.setSelectedIndex(0);
		CPU.setBounds(40, 160, 200, 40);
		contentPane.add(CPU);
		
		JComboBox<String> GPU = new JComboBox<String>();
		GPU.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select GPU>", "Integrated ", "Nvidia GeForce RTX 3070", "AMD Radeon RX 6800 XT"}));
		GPU.setSelectedIndex(0);
		GPU.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GPU.setBounds(40, 220, 200, 40);
		contentPane.add(GPU);
		
		JComboBox<String> RAM = new JComboBox<String>();
		RAM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		RAM.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select RAM>", " 8 GB", "16 GB", "32 GB"}));
		RAM.setSelectedIndex(0);
		RAM.setBounds(40, 280, 200, 40);
		contentPane.add(RAM);
		
		JComboBox<String> ROM = new JComboBox<String>();
		ROM.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select ROM>", "512 GB HDD", "512 GB SSD", " 1 TB HDD", " 1 TB SDD", " 2 TB HDD"}));
		ROM.setSelectedIndex(0);
		ROM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ROM.setBounds(40, 340, 200, 40);
		contentPane.add(ROM);
		
		JComboBox<String> Source = new JComboBox<String>();
		Source.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select Source>", " 400 Watts", " 600 Watts", " 800 Watts", "1000 Watts"}));
		Source.setSelectedIndex(0);
		Source.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Source.setBounds(40, 400, 200, 40);
		contentPane.add(Source);
		
		JComboBox<String> DefaultBuild = new JComboBox<String>();
		DefaultBuild.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DefaultBuild.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select Default Build>", "Gaming", "Office", "Workstation"}));
		DefaultBuild.setBounds(346, 40, 200, 40);
		contentPane.add(DefaultBuild);
		
		Title = new JTextField();
		Title.setBackground(Color.WHITE);
		Title.setEditable(false);
		Title.setBounds(339, 169, 219, 28);
		contentPane.add(Title);
		Title.setColumns(10);
		
		JTextArea Build = new JTextArea();
		Build.setEditable(false);
		Build.setFont(new Font("Monospaced", Font.PLAIN, 15));
		Build.setBounds(308, 215, 298, 264);
		contentPane.add(Build);
		
		JButton GenCoustom = new JButton("Build Custom PC");
		GenCoustom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	String v1, v2, v3, v4, v5, v6, v7;
				// Preluam specificatiile dupa care va fi construit obiectul 
				v1 = (Case.getSelectedIndex()!=0)? Case.getSelectedItem().toString() : "none";
				v2 = (Motherboard.getSelectedIndex()!=0)? Motherboard.getSelectedItem().toString() : "none";
				v3 = (CPU.getSelectedIndex()!=0)? CPU.getSelectedItem().toString() : "none";
				v4 = (GPU.getSelectedIndex()!=0)? GPU.getSelectedItem().toString() : "none";
				v5 = (RAM.getSelectedIndex()!=0)? RAM.getSelectedItem().toString() : "none";
				v6 = (ROM.getSelectedIndex()!=0)? ROM.getSelectedItem().toString() : "none";
				v7 = (Source.getSelectedIndex()!=0)? Source.getSelectedItem().toString() : "none";

				// Definim un ConcreteBuilder si un Director
				CustomPCBuilder custombuild = new CustomPCBuilder();
				Director dir = new Director(custombuild);
				
				// Construirea obiectului
				dir.buildCustomPC(v1, v2, v3, v4, v5, v6, v7);
				
				// Obtinerea obiectului
				PC pc = dir.returnPC();
				// Afisare
				Title.setText("Builder constructed Custom PC:");
				Build.setText(pc.toString());
			}
		});
		
		GenCoustom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GenCoustom.setBounds(40, 465, 200, 34);
		contentPane.add(GenCoustom);
		
		JButton GenDefault = new JButton("Build Default PC");
		GenDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// in functie de optiunea aleasa, se construieste un tip de PC predefinit
				switch (DefaultBuild.getSelectedItem().toString()) {
				case "<Select Default Build>":
					Title.setText("ENTER AN OPTION FIRST!");
					Build.setText("");
					break;
				case "Office":
					
					// Definim un ConcreteBuilder si un Director					
					PCBuilder office = new OfficePCBuilder();
					Director dir1 = new Director(office);
					
					// Construirea obiectului
					dir1.buildPC();
					
					// Obtinerea obiectului
					PC pc1 = dir1.returnPC();
					
					// Afisare
					Title.setText("Build Office PC:");
					Build.setText(pc1.toString());
					break;
					
				case "Gaming":
					PCBuilder gaming = new GamingPCBuilder();
					Director dir2 = new Director(gaming);
					dir2.buildPC();
					PC pc2 = dir2.returnPC();
					Title.setText("Build Gaming PC:");
					Build.setText(pc2.toString());
					break;
					
				case "Workstation":
					PCBuilder workstation = new WorkstationPCBuilder();
					Director dir3 = new Director(workstation);
					dir3.buildPC();
					PC pc3 = dir3.returnPC();
					Title.setText("Build Workstation PC:");
					Build.setText(pc3.toString());
					break;
				}
			}
		});
		
		GenDefault.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GenDefault.setBounds(346, 103, 200, 34);
		contentPane.add(GenDefault);	
	}
}