package mvcpro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvcpro.controller;

public class view extends JFrame{

	private double firstNum ,secondNum ,result ;	
	private controller cv;
	
	private JTextField t1, t2,t3;//first number/second number/Result
	
	private JLabel l1 = new JLabel("First number");
	private JLabel l2 = new JLabel("Second number");
	private JLabel l3 = new JLabel("Result");
	
	public JButton b1 = new JButton("+");
	public JButton b2 = new JButton("-");
	public JButton b3 = new JButton("X");
	public JButton b4 = new JButton("/");
	public JButton b5 = new JButton("%");
	public JButton b6 = new JButton("C");
	
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private GridLayout g =new GridLayout(3,2,30,10);
	private GridLayout gg =new GridLayout(3,1);

	
	public view (){
		t1 = new JTextField("0"); // first number
		t2 = new JTextField("0"); // second number
		t3 = new JTextField("0"); // result
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setBackground(Color.pink);
		
	    this.t1.setEditable(true);
	    this.t2.setEditable(true);
	    this.t3.setEditable(true);
		
	    p1.setLayout(g);
	    p2.setLayout(g);
	    
	    this.setLayout(gg);
	    p1.add(b1); p1.add(b2); 
	    p1.add(b3); p1.add(b4); 
	    p1.add(b5); p1.add(b6);
	   
	    p2.add(l1);p2.add(t1);
	    p2.add(l2);p2.add(t2); 
	    p2.add(l3);p2.add(t3);
	    
	    this.add(p2);
	    this.add(p1);
		
	}
	
	public double getFirstNum(){return Double.parseDouble(this.t1.getText());}
	public double getSecondNum(){return Double.parseDouble(this.t2.getText());}
	
	public void setNums(double n1,double n2){
		this.firstNum=n1;
		t1.setText(""+this.firstNum);
		this.secondNum=n2;
		this.t2.setText(""+this.secondNum);
	}
	
	public void setResult(double r){
		result = r;
		this.t3.setText(Double.toString(r));
	 	}
	
	public void addlistener(ActionListener add){this.b1.addActionListener(add);}
	public void sublistener(ActionListener sub){this.b2.addActionListener(sub);}
	public void mullistener(ActionListener mul){this.b3.addActionListener(mul);}
	public void divlistener(ActionListener div){this.b4.addActionListener(div);}
	public void modlistener(ActionListener mod){this.b5.addActionListener(mod);}
	public void clearlistener(ActionListener clear){this.b6.addActionListener(clear);}
	
}
