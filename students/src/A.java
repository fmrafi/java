
 class A {

	void display()
	{
		System.out.println("called class A");
	}}
	class B extends A{
		void display()
		{
			super.display();
			System.out.println("called class B");
		}

	}
 class C extends B{
		void display()
		{
			super.display();
			System.out.println("called class C");
		}
 }
class Faisal{
	
	
	
	public static void main(String[] args) {
		C ob=new C();
		ob.display();

	}

}
