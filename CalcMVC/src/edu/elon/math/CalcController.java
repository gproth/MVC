package edu.elon.math;

public class CalcController implements CalcControlInterface {
	private CalcModelInterface model;
	
	private Display gui;
	
	public CalcController(CalcModelInterface model){
		this.model = model;
		
		gui = new CalcGui(this, model);
		gui.createPane();
	}
	
	@Override
	public void updateOp(String op) {
		model.setOp(op);
		
	}

	@Override
	public void updateIn(String in) {
		if(in.equals(".")){
			System.out.println("hi");
			model.setDecimal(in);
		}else{
			model.updateInput(in);
		}
		
	}

	@Override
	public void calculate() {
		model.calcTotal();
		
	}

}
