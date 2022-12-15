package BackJun.ex02.Solved_ac;

import java.util.Scanner;

public class Main_10950 {

	public static void main(String args[]) {
		 
		Scanner in = new Scanner(System.in);
 
		int c = in.nextInt(); //테스트 케이스를 받을 변수 
		int arr[] = new int[c];//c까지만  돌아감
 
		for (int i = 0; i < c; i++) {	//인덱스 번호는 0번부터 시작되며, 인덱스 번호 부여는 c까지 부여된다
			int a = in.nextInt();
			int b = in.nextInt();
			arr[i] = a + b; //a와b값을 더한 값이 인덱스 방 번호에 들어감
		}
		
		in.close();
 
		for (int k : arr) {
			System.out.println(k);
		}
	}
 
}
