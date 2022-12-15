package BackJun.ex02.Solved_ac;

import java.util.Scanner;

public class Main_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
	
	while(true) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A==0 && B==0) {
			sc.close();
			break;
		}
		System.out.println(A+B);
	}
	}

}
