package javafornoob;

public class P22 {
	public String toBinal(int i) {
		if(i==1)
			return "1";
		if(i%2==0)
			return toBinal(i/2)+"0";
		if(i%2==1)
			return toBinal(i/2)+"1";
		return "";
	}
	public static void main(String[] args) {
		P22 p = new P22();
		System.out.println(p.toBinal(123));
	}

}
