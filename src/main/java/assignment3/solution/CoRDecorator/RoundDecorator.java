/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment3.solution.CoRDecorator;

import java.text.DecimalFormat;

public class RoundDecorator extends Decorator{
	Handler handler;
	public RoundDecorator(Handler handler)
	{
		this.handler=handler;
	}

	@Override
	public String handleRequest(String msg, double value) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00"); 
		String result=df.format(Double.parseDouble(handler.handleRequest(msg, value)));
	 
		return result;
	}

}
