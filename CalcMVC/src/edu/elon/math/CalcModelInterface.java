package edu.elon.math;

public interface CalcModelInterface {

	public void updateInput(String in);
	
	public void calcTotal();
	
	public void setOp(String in);
	
	public void runCalcs();
	
	public void setDecimal(String in);
	
	public void addObserver(Display o);
	
	public void removeObserver(Display o);
	
	public void notifyObservers(String op);
}
