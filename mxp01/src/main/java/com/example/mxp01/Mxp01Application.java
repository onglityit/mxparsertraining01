package com.example.mxp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mariuszgromada.math.mxparser.mXparser;

@SpringBootApplication
public class Mxp01Application {

	public static void main(String[] args) {
		//SpringApplication.run(Mxp01Application.class, args);
		mXparser.consolePrintHelp("sine");
		mXparser.consolePrintHelp("key=sin");
	}

}
