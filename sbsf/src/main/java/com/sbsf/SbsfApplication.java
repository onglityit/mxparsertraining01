package com.sbsf;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbsfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbsfApplication.class, args);
		Arrays.asList(new Car[] {
				new Car("kancil", 100000) ,
				new Car("myvi", 49000)
		}).stream().filter(c -> c.km < 50000).forEach(System.out::println);;
	}
}

class Car{
	public String make;
	public int km;
	public Car(String _make, int _km) {
		this.make = _make;
		this.km = _km;
	}
	public String toString() {
		return make + " " + Integer.toString(km);
	}
}