package com.getset;

public class GetSet {
	private int a;
	private int b;
	private int c;
    private int d;
    private float e;
    private float f;
    private String name;
	public float getE() {
		return e;
	}
	public void setE(double g) {
		this.e = (float) g;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "GetSet [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + ", name=" + name
				+ "]";
	}
	
	
    

}
