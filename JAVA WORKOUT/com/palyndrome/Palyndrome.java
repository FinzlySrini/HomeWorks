package com.palyndrome;

public class Palyndrome {
	public static void main (String[] args) {	
		for (int i = 0;i<2147468648;i++)
		System.out.println(i);
		//meth("madam");
	}
public static void meth(String str) {
String equal = "";
//String b = "";

for(int i=0;i<str.length()-1;i++){
	for (int j=i+1;j<str.length();j++){
		if(str.charAt(i)==str.charAt(j)){ 
			equal = str.substring(i,j+1);
			int c =equal.length()-1;
			//System.out.println(equal);
			String b = "";
			while(c>=0) {
				b=b+equal.charAt(c);
				c--;
				
				//System.out.println(b);
				}
			
			//System.out.println(b);
		//	if (b.equalsIgnoreCase(equal)) {
			//	System.out.println(b);
			//}	
}

}
}

}
}

