package Chapter12.ex01;

interface C {
	void a ();
}

class Aa implements C{
	@Override
	public void a() {
		System.out.println("메롱");
	}
}

public class InterFace01 {
public static void main(String[] args) {

	C a1 = new Aa();
	a1.a();
}

}


