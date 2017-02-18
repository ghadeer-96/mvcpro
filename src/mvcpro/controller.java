package mvcpro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import mvcpro.model;
import mvcpro.view;
public class controller {

	private float fn , sn;
	private view v1= new view ();
	private model m1= new model();
	
public controller(view v , model m){
	this.v1=v;
	this.m1=m;
	this.v1.addlistener(new perform());
	this.v1.sublistener(new perform());
	this.v1.mullistener(new perform());
	this.v1.divlistener(new perform());
	this.v1.modlistener(new perform());
	this.v1.clearlistener(new perform());
}	

class perform implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==v1.b1){	
			m1.add(v1.getFirstNum(), v1.getSecondNum());
			v1.setResult(m1.getResult());
		}//addition
		if(e.getSource()== v1.b2){
			m1.sub(v1.getFirstNum(), v1.getSecondNum());
			v1.setResult(m1.getResult());
		}//subtraction
		if(e.getSource()== v1.b3){
			m1.mul(v1.getFirstNum(), v1.getSecondNum());
			v1.setResult(m1.getResult());
		}//multiplication 
		if(e.getSource()== v1.b4){
			if(m1.isSecNum0(v1.getSecondNum())){
				JOptionPane.showMessageDialog(v1,"You will divide by zero! please enter numbers again .", "Arithmatic error", JOptionPane.ERROR_MESSAGE);
			}
			else
			{m1.div(v1.getFirstNum(), v1.getSecondNum());
			v1.setResult(m1.getResult());}
		}//division
		if(e.getSource()== v1.b5){
			if(m1.isSecNum0(v1.getSecondNum())){
				JOptionPane.showMessageDialog(v1,"You will divide by zero! please enter numbers again .", "Arithmatic error", JOptionPane.ERROR_MESSAGE);
			}
			else{
			m1.mod(v1.getFirstNum(), v1.getSecondNum());
			v1.setResult(m1.getResult());}
		}//modulus
		if(e.getSource()== v1.b6){
			m1.clear();
			v1.setNums(0, 0);
			v1.setResult(m1.getResult());
			
		}//clear all
		
	}//actionPerformed
}//class perform


}
