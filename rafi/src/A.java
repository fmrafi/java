import C.D;


public class A {

	int a;
	void show()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		A ob=new A();
		ob. a=10;
		ob.show();
		B obj=new B();
		obj.show();
		D ob1=new D();
		ob1. a=20;
		ob1. b=30;
		ob1.show();

	}

}
