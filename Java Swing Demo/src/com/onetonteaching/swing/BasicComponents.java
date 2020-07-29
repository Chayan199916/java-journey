package com.onetonteaching.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	public Components() {
		
		label = new JLabel("Welcome to swing journey...");
		jTextField = new JTextField(20);
		jButton = new JButton("Click me!");
		
		add(label);
		add(jTextField);
		add(jButton);
		
		jButton.addActionListener(ae -> {			// addActionListener takes object of ActionListener which is a functional Interface, So we can use lambda expression 
				// TODO Auto-generated method stub
			jTextField.setText("Hello world!");	
			
		});
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}