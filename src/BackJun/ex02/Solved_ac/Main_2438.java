package BackJun.ex02.Solved_ac;

import java.util.Scanner;

public class Main_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		int k= 1;
		for(int j= 1; j <= i ; j++ ) {
			for(k = 1; k <= j ; k++) {
				System.out.print("*");
			}
		System.out.println();				// i가 5이면 j가 5가 될때까지 돌아야됨 이 말은 i가 j보다 커지면 멈춘다. 
		}
			sc.close();		
	}

}
