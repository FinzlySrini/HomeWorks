package com.ninth9;
import com.getset.*;

public class Quad {
	public String   met7() { 
		GetSet ge = new GetSet();
		ge.setB(5);
		ge.setA(4);
		ge.setC(4);
		return (int) Math.pow(ge.getA(), 2)+ (ge.getB())+"x" + ge.getC();
		
	}


}


