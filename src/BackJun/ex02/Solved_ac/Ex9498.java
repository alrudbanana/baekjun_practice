package BackJun.ex02.Solved_ac;

import java.util.Scanner;

public class Ex9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		if(a >= 60 && a <= 69) {
			System.out.println("D");
		} else if(a >= 70 && a <= 79 ){
			System.out.println("C");
		} else if( a>= 80 && a <= 89) {
			System.out.println("B");
		} else if(a >= 90 && a <= 100 ) {
			System.out.println("A");
		} else {
			System.out.println("F");
		}
		sc.close();
	}

}
