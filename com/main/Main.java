package com.main;
import com.add1.*;
import com.div3.Division;
import com.getset.GetSet;
import com.sub2.*;
import com.volume6.*;
import com.mul4.*;
import com.ninth9.Quad;
import com.peri7.Perimeter;
import com.area5.*;
import com.cuboid8.*;
import com.tenth10.*;
public class Main {
	public static void main(String[] args) {
	//add
		Addition add = new Addition();
		System.out.println(add.met1());
	//sub
		Subraction sub = new Subraction();
	System.out.println(sub.met2());	
	//mul
	  	Multiplication mul = new Multiplication();
	  	System.out.println(mul.mult());
	//div
	  	Division div = new Division();
	  	div.div();
	//volume
	  	Volume vol = new Volume();
	  	System.out.println(vol.met5());
	//Area
	  	Area5 ar = new Area5();
	    System.out.println(ar.met6());
	//cuboid
	    Cuboid cc = new Cuboid();
	    System.out.println(cc.met6());
	//Quad
	    Quad qu = new Quad();
	    System.out.println(qu.met7());
	//Peri
	    Perimeter pp = new Perimeter();
	  	System.out.println(pp.met9());
	//get over ride
	  	GetSet g = new GetSet();
	  	System.out.println(g.toString());
	//tenth
	  	Tenth ff = new Tenth();
	  	System.out.println(ff.met10());
	  	
	  	
	}

}
