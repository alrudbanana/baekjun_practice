package Chapter12.ex01;


abstract class A {
	abstract void cry();
}


class B extends A {
	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("으앙으앙");
	}
}
public class Abstract {

	public static void main(String[] args) {
		A a = new B ();
		a.cry();
		
		A b = new A() {
			@Override
			void cry() {
				System.out.println("으앙");
				
			}

	};
	b.cry();
}
}