package BackJun.ex01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int look = 2;
		int bshop = 2;
		int knight = 2;
		int phone = 8;
		king = king- sc.nextInt();
		queen =queen- sc.nextInt();
		look = look-sc.nextInt();
		bshop=bshop-sc.nextInt();
		knight = knight-sc.nextInt();
		phone = phone-sc.nextInt();
		
		System.out.print(king + " ");
		System.out.print(queen+ " ");
		System.out.print(look+ " ");
		System.out.print(bshop+ " ");
		System.out.print(knight+ " ");
		System.out.print(phone+ " ");
		
		sc.close();
	}

}
