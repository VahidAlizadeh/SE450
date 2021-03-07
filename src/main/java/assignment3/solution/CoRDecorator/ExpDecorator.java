/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment3.solution.CoRDecorator;

import java.util.Formatter;

public class ExpDecorator extends Decorator {
	Handler handler;
	public ExpDecorator(Handler handler)
	{
		this.handler=handler;
	}

	@Override
	public String handleRequest(String msg, double value) {
		  Formatter fmt = new Formatter();
		    // Format to 2 decimal places in a 16 character field. 
		    fmt = new Formatter(); 
		    String convertedValue=handler.handleRequest(msg, value);
		    int count=0;
		    for(int i=0;i<convertedValue.length();i++) {
		    	if(!(convertedValue.charAt(i)=='.')) 
		    	{ if(convertedValue.charAt(i)=='0') {
		    		if(i!=0) {count++;}
		    		
		    	}
		    	else {
		    		count++;
		    	}
		    } }
		    count=count-1;
		    String number="%16."+count+"e";
		    fmt.format(number, Double.parseDouble(convertedValue));
		    String result=fmt.toString();
		return result;
				
	}

}
