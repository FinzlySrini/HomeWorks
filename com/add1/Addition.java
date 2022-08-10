package com.add1;
import com.getset.*;

public class Addition {
 
 public int met1() {
	 GetSet gset = new GetSet();
	 gset.setA(8);
	 gset.setB(3);
	return gset.getA()+gset.getB();	 
 }
}
