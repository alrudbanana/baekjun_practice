package IF_ELSE;

import java.util.Scanner;

public class yunyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//y 년도를 받을 변수
		int y = sc.nextInt();
		
		//4의 배수 이면 
		if(y % 4 ==0) {
			if(y % 400 == 0) { //400의 배수여야함 
				System.out.println(1);//=> 윤년
			}
			else if (y % 100 ==0) { //400의 배수가 아니라면 0(윤년아님)
			System.out.println(0);
			}else {
				System.out.println(1);	//400의 배수가 아니고 4의 배수이면 1윤년
			}
		}else{
			System.out.println(0);	//4의 배수가 아니라면 else => 윤년아님 
		sc.close();
		}
	}
}