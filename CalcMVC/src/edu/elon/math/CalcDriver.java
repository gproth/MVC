package edu.elon.math;

public class CalcDriver {

	public static void main(String[] args) {
		CalcModelInterface model = new CalcModel();
		CalcControlInterface control = new CalcController(model);

	}

}
