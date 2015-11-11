package edu.elon.math;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcGui extends JFrame implements Display{
	private JFrame frame;
	private JPanel buttonPanel;
	private JTextField displayField;
	private CalcModel model;
	private CalcController control;

	public CalcGui(CalcController c, CalcModel m){
		control = c;
		model = m;
		model.addObserver(this);
	}

	public void createPane() {
		frame = new JFrame();
		displayField = new JTextField("");
		buttonPanel = createButtons();
		JPanel main = new JPanel(new GridLayout(2, 0));
		main.add(displayField);
		main.add(buttonPanel);
		frame.add(main);
		frame.pack();
		frame.setVisible(true);
	}

	public JPanel createButtons() {
		JPanel panel = new JPanel(new GridLayout(4, 4));

		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("0");
			}
		});
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("1");
			}

		});

		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("2");
			}

		});

		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("3");
			}

		});

		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("4");
			}

		});

		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("5");
			}

		});

		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("6");
			}

		});

		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("7");
			}

		});

		JButton button8 = new JButton("8");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("8");
			}

		});

		JButton button9 = new JButton("9");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn("9");
			}

		});

		JButton buttonDot = new JButton(".");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateIn(".");
			}

		});

		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.calculate();
			}

		});

		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateOp("+");
			}

		});

		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateOp("-");
			}

		});

		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateOp("/");
			}

		});

		JButton buttonMult = new JButton("*");
		buttonMult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.updateOp("*");
			}

		});
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonDiv);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonMult);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonMinus);
		panel.add(button0);
		panel.add(buttonDot);
		panel.add(buttonEquals);
		panel.add(buttonPlus);
		return panel;

	}
	

	@Override
	public void update(String inp) {
		displayField.setText(inp);
	}

	
}