package mvcpro;
import mvcpro.view;
import mvcpro.controller;
import mvcpro.model;

public class calculator {
	public static void main (String[] args){
    
		view calview = new view();
		model calmodel = new model();
		controller calctrl = new controller(calview,calmodel);
		calview.setVisible(true);
    	
    }
}
