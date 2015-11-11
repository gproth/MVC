package edu.elon.math;

public class CalcDriver {

	public static void main(String[] args) {
		CalcModel model = new CalcModel();
		CalcController control = new CalcController(model);

	}

}
