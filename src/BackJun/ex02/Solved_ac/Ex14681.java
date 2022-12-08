package BackJun.ex02.Solved_ac;

import java.util.Scanner;

public class Ex14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x , y ;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0) {
			if(y > 0) {
				System.out.println(1);
			}
			else (y < 0) {
				System.out.println(4);
			}
		}
		
		if(x<0) {
			if(y>0) {
				System.out.println(2);
			}
			else (y<0) {
				System.out.println(3);
			}
		}
	}
}
