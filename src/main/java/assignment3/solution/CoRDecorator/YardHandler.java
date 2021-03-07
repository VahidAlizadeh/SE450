/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment3.solution.CoRDecorator;

public class YardHandler extends Handler{

	public String handleRequest(String msg, double value)
	 {
		 if (msg.equalsIgnoreCase("YARD"))
		 {    return String.valueOf(value*1093.61);
		 }
		 else
		 { // Pass message to the next handler
		 if (successor != null) return(successor.handleRequest(msg,value));
		 }
		return "";
	
	
	 
	
	  }   }
