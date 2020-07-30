package com.onetonteaching.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BasicComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Components components = new Components();

	}

}

class Components extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	JTextField jTextField;
	JButton jButton;
	JRadioButton jRadioButton1, jRadioButton2;
	ButtonGroup buttonGroup;
	JCheckBox jCheckBox1, jCheckBox2, jCheckBox3;
	JProgressBar jProgressBar;
	JMenuBar jMenuBar = new JMenuBar();
	JMenu jMenu = new JMenu("Menu Demo");
	JMenuItem jMenuItem1, jMenuItem2, jMenuItem3;
	
	public Components() {
		
		label = new JLabel("Welcome to swing journey...");
		jTextField = new JTextField(20);
		jButton = new JButton("Click me!");
		jRadioButton1 = new JRadioButton("Web app");
		jRadioButton2 = new JRadioButton("Android app");
		buttonGroup = new ButtonGroup();
		jCheckBox1 = new JCheckBox("Freelancing");
		jCheckBox2 = new JCheckBox("Teaching");
		jCheckBox3 = new JCheckBox("Working on projects");
		jMenuItem1 = new JMenuItem("About me");
		jMenuItem2 = new JMenuItem("Hobbies");
		jMenuItem3 = new JMenuItem("Projects");
		
		jMenu.add(jMenuItem1);
		jMenu.add(jMenuItem2);
		jMenu.add(jMenuItem3);
		jMenuBar.add(jMenu);
		setJMenuBar(jMenuBar);
		add(label);
		add(jTextField);
		add(jButton);
		add(jRadioButton1);
		add(jRadioButton2);
		add(jCheckBox1);
		add(jCheckBox2);
		add(jCheckBox3);
		
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println(e.getX() + ", " + e.getY());
				
			}
			
		});
		jCheckBox1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hello");
				
			}
		});
		jButton.addActionListener(ae -> {			 
				// TODO Auto-generated method stub
			jTextField.setText("Hello world!");	
			
			if (jRadioButton1.isSelected()) {
				
				System.out.println("Web app");
				
			}else if (jRadioButton2.isSelected()){
				
				System.out.println("Android app");
				
			}
			
			if (jCheckBox1.isSelected()) {
				
				System.out.println("Freelancing");
				
			}
			
			if (jCheckBox2.isSelected()) {
				
				System.out.println("Teaching");
				
			}
			if (jCheckBox3.isSelected()) {
				
				System.out.println("Working on projects");
				
			}
			
		});
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}