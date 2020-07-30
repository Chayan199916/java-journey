package com.onetonteaching.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;


public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intro intro = new Intro();

	}

}

class Intro extends JFrame implements ActionListener{
	
	int i;
	JButton jButton;
	JProgressBar jProgressBar;
	Timer timer;
	
	public Intro() {
		
		i = 0;
		jButton = new JButton("Start!");
		jProgressBar = new JProgressBar(0, 20);
		
		add(jButton);
		add(jProgressBar);
		jProgressBar.setStringPainted(true);
		
		timer = new Timer(500, this);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
//				new Components();
//				dispose();
				timer.start();
				
			}
		});
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(i == 20) {
			
			new Components();
			dispose();
			timer.stop();
			
		}
			
		i++;
		jProgressBar.setValue(i);
		
	}
	
}