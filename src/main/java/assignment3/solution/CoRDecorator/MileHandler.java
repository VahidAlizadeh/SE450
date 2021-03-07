/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment3.solution.CoRDecorator;

public class MileHandler extends Handler{

	 public String handleRequest(String msg, double value)
	 {
	 if (msg.equalsIgnoreCase("MILE"))
	 {   return String.valueOf(value*0.621371);
	 }
	 else
	 { // Pass message to the next handler
	 if (successor != null) return(successor.handleRequest(msg,value));
	 }
	return "";
	 }
	} 
