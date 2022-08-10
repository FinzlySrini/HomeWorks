package com.palyndrome;

public class Division {
void div(int a, int b, int c, int d, int e) {
	int avg = (a+b+c+d+e)/5;
	
	if(avg>=60&&avg<=100){
	System.out.println("First division");
	}
	else if(avg<=59&&avg>=50){
		System.out.println("Second division");	
	}
	else if(avg<=59&&avg>=40) {
		System.out.println("First division");
	}
	else {
		System.out.println("Fail");
	}
	
}
	
}
