/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment3.solution.CoRDecorator;

public class Converter {
	
public static void main(String[] args) {
	ConverterGUI ui = new ConverterGUI();
	
}

public static String convert(String unit, double inputValue) {
	Handler h1= new MileHandler();
	Handler h2= new YardHandler();
	Handler h3= new FootHandler();
	h1.SetSuccessor(h2);
	h2.SetSuccessor(h3);
	h1=new RoundDecorator(h1);
	h1=new ExpDecorator(h1);
	h1=new AddUnitDecorator(h1);
	String result=h1.handleRequest(unit,inputValue);
	return(result);
	
}
}
