/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment1.solution.exercise5;

public class Assignment {
    private double mark=-1;
    Assignment() {}
    public double getMark() throws NotYetSetException {
        if (mark==-1) {
            throw new
                    NotYetSetException("Mark is not yet set");
        }
        return mark;
    }
    public void setMark( int m) {
        mark=m;
    }
}

class NotYetSetException extends Exception
{
    public NotYetSetException(String s) {
        super(s);
    }
}
