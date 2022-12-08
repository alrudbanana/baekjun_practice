package BackJun.ex02.Solved_ac;

import java.util.Scanner;

public class Ex1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a= sc.nextInt();
		b=sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
			
		}
		
		if(a<b) {
			System.out.println("<");
		}
		if(a==b) {
			System.out.println("==");
		}
		sc.close();
	}

}
