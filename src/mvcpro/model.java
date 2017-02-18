package mvcpro;

import javax.swing.JOptionPane;

public class model {

	private double result;
	

	public void add(double n1, double n2){
		this.result = n1+n2;
	}
	public void sub(double n1, double n2){
		this.result = n1-n2;
	}
	public void mul(double n1, double n2){
		this.result = n1*n2;
	}
	public void div(double n1, double n2){
	    this.result = n1/n2;
	}
	public void mod(double n1, double n2){
		this.result = n1%n2;
	}
	public boolean isSecNum0(double n2){
		if(n2==0)
			return true ;
		return false ;
	} 

	public void clear(){this.result=0;}
	public double getResult(){return this.result;}
	
}
