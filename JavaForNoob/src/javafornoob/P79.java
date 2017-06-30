package javafornoob;

public class P79 {
	
	public static void print(int ...p) {
		for(int en : p) {
			System.out.printf("[%d]",en);
		}
		System.out.printf("\n");
	}
	public static void print(String ...p) {
		for(String en : p) {
			System.out.printf("[%s]",en);
		}
		System.out.printf("\n");
	}
	public static void print(Flower ...p) {
		for(Flower en : p) {
			System.out.printf("[%s]",en);
		}
		System.out.printf("\n");
	}
	
	
	public static void main(String[] args) {
		byte b =  011; 
		System.out.println(b);
	}
}
