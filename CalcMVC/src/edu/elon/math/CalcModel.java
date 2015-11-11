package edu.elon.math;

import java.util.ArrayList;

public class CalcModel implements CalcModelInterface {
	private double total;
	private String input;
	private String op;
	private boolean isResult;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	public CalcModel(){
		isResult = false;
		input = "";
		total = 0.0;
		op = "";
	}
	
	
	@Override
	public void updateInput(String in) {
		if (isResult) {
			total = 0.0;
			isResult = false;
		}if (input == null) {
			input = "" + in;
		}else {
			input = input + in;
		}
		notifyObservers(input);

	}

	@Override
	public void calcTotal() {
		runCalcs();
		op = "";
		isResult = true;
		input = "";
		notifyObservers("" + total);
		
	}

	@Override
	public void setOp(String in) {
		if (isResult) {
			isResult = false;
		} else {
			if (total == 0.0) {
				total = Double.parseDouble(input);
			} else {
				runCalcs();
			}
			op = in;
			input = "";
			
			notifyObservers(input);
		}
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers(String out) {
		for(Observer o : observers){
			o.update(out);
		}
		
	}


	@Override
	public void runCalcs() {
		if (op.equals("+")) {
			total = total + Double.parseDouble(input);
		} else if (op.equals("-")) {
			total = total - Double.parseDouble(input);
		} else if (op.equals("/")) {
			total = total / Double.parseDouble(input);
		} else {
			total = total * Double.parseDouble(input);
		}
		System.out.println(total);
		
	}


	@Override
	public void setDecimal(String in) {
		System.out.println("hi");
		if (input.contains(".") == false){
			input = input + in; 
		}
		notifyObservers(input);
	}

}
