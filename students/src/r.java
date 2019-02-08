
public class r {

	void display()
	{
		System.out.println("called class A");
	}}
	class a extends r{
		void display()
		{
			super.display();
			System.out.println("called class B");
		}

	}
 class f extends a{
		void display()
		{
			super.display();
			System.out.println("called class C");
		}
 }
class Faisal1{
	
	
	public static void main(String[] args) {
		f ob=new f();
		ob.display();

	}

}
