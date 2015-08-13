package com.smarcotte.japplet_demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyApplet extends JApplet implements ActionListener
{
	// class level references
	private JButton btnClick;
	
	// initialize the applet
	public void init()
	{
		// assign a layout manager
		this.setLayout(new FlowLayout());
		
		// create component (object to place on the applet)
		btnClick = new JButton("Click Me");
		btnClick.addActionListener(this);
		
		// add component to the applet
		this.add(btnClick);
	}
	
	@Override
	public void actionPerformed(ActionEvent ev)
	{
		// tell java what to do when the button is clicked
		if(ev.getSource() == btnClick)
		{
			JOptionPane.showMessageDialog(this, "You pressed my button!");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Error. Invalid Button.");
		}

	}

}
