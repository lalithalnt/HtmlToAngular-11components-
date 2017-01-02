package com.othersamples;

import javax.swing.JButton;
import javax.swing.JFrame;  
import com.othersamples.ComponentBuilderUtil;

	public class FirstSwingExample {  
		
		
		
	public static void main(String[] args) {  
		
		FirstSwingExample fsx=new FirstSwingExample();
		
	JFrame f=new JFrame();//creating instance of JFrame  
	          
	JButton b=new JButton("click");//creating instance of JButton
	
	JButton be=new JButton("Reset");
	
	b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
	          
	f.add(b);//adding button in JFrame  
	f.add(be);
	
	
	
	
	f.setSize(400,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  
	
	}  
	}  

