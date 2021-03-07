/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment3.solution.CoRDecorator;

public class AddUnitDecorator extends Decorator{
     
	Handler handler;
	public AddUnitDecorator(Handler handler)
	{
		this.handler=handler;
	}
	@Override
	public String handleRequest(String msg, double value) {
	
		return (handler.handleRequest(msg, value)+" "+msg+"s");
	}

}
