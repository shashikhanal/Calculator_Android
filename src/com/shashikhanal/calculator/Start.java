package com.shashikhanal.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Start extends Activity {

	Button one, two, three, four, five, six, seven, eight, nine, zero, add,
			sub, div, mul, point, ac, equal;
	// TextView display;
	EditText display;
	long number = 0;
	int counter = 0, p = 0;
	int flag = 0, not = 0;
	long num1, num2;
	
	public void start() {

		one = (Button) findViewById(R.id.button7);
		two = (Button) findViewById(R.id.button8);
		three = (Button) findViewById(R.id.button9);
		four = (Button) findViewById(R.id.button4);
		five = (Button) findViewById(R.id.button5);
		six = (Button) findViewById(R.id.button6);
		seven = (Button) findViewById(R.id.button1);
		eight = (Button) findViewById(R.id.button2);
		nine = (Button) findViewById(R.id.button3);
		zero = (Button) findViewById(R.id.button15);
		add = (Button) findViewById(R.id.button10);
		sub = (Button) findViewById(R.id.button12);
		div = (Button) findViewById(R.id.button13);
		mul = (Button) findViewById(R.id.button14);
		point = (Button) findViewById(R.id.button16);
		ac = (Button) findViewById(R.id.button17);
		equal = (Button) findViewById(R.id.button11);
		display = (EditText) findViewById(R.id.editText1);

		one.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (flag ==1){
					display.setText(" ");
				}
				if (counter <= 9) {
					number = number * 10 + 1;
					display.setText("" + number);
				}
			}
		});
		two.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 2;
					display.setText("" + number);
				}
			}
		});
		three.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 3;
					display.setText("" + number);
				}
			}
		});
		four.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 4;
					display.setText("" + number);
				}
			}
		});
		five.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 5;
					display.setText("" + number);
				}
			}
		});
		six.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 6;
					display.setText("" + number);
				}
			}
		});
		seven.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 7;
					display.setText("" + number);
				}
			}
		});
		eight.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 8;
					display.setText("" + number);
				}
			}
		});
		nine.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 9;
					display.setText("" + number);
				}
			}
		});
		zero.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				if (counter <= 9) {
					number = number * 10 + 0;
					display.setText("" + number);
				}
			}
		});
		point.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				/*
				 * counter++; p=counter+1;
				 */
			}
		});
		add.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				flag = 1;
				num1 = number;
				display.setText("+");
				counter = 0;
				number = 0;
				start();
			}
		});
		sub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				flag = 2;
				num1 = number;
				display.setText("-");
				counter = 0;
				number = 0;
				start();
			}
		});
		div.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				flag = 4;
				num1 = number;
				display.setText("/");
				counter = 0;
				number = 0;
				start();
			}
		});
		mul.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				flag = 3;
				num1 = number;
				display.setText("*");
				counter = 0;
				number = 0;
				start();
			}
		});
		ac.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter = 0;
				number = 0;
				flag = 0;
				num1 = 0;
				display.setText("" + number);
			}
		});
		equal.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (flag == 1) {
					long result = number + num1;
					display.setText("" + result);
				}else if (flag == 2){
					long result = num1 - number;
					display.setText("" + result);
				}else if (flag == 3){
					long result = number * num1;
					display.setText("" + result);
				}else if (flag == 4){
					double result = num1 / number;
					display.setText("" + result);
				}
			}
		});
		//
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		start();
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

}
