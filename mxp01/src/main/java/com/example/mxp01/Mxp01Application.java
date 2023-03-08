package com.example.mxp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.mXparser;

@SpringBootApplication
public class Mxp01Application {

	public static void main(String[] args) {
		//SpringApplication.run(Mxp01Application.class, args);
		mXparser.consolePrintHelp("sine");
		mXparser.consolePrintHelp("key=sin");
		
		Expression e = new Expression("2(3+4)3");
		mXparser.consolePrintln(e.getExpressionString() + " = " + e.getCanonicalExpressionString());
		mXparser.consolePrintln("Res: " + e.getExpressionString() + " = " + e.calculate());
	}

}
