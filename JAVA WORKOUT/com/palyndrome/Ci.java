package com.palyndrome;

public class Ci {
  float a =1;
  float r =7;
  float n=3;
  double t =4;
  float v = 1+(r/n);
  float g=(float) (n*t);
  float A = (float) (a*Math.pow(v, g));
  void runci() {
	  System.out.println(A);
  }
}
