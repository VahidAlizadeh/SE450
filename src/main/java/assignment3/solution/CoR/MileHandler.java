/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment3.solution.CoR;

public class MileHandler extends Handler{

	 public String handleRequest(String msg, double value)
	 {
	 if (msg.equalsIgnoreCase("MILE")) {
		 double result=value*0.621371;
	     return(String.valueOf(result));

	 }
	 else
	 { // Pass message to the next handler
	 if (successor != null) return(successor.handleRequest(msg,value));
	 }
	return "";
	 }
	} 
