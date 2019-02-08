import java.util.Scanner;


public class Mhm {

	static Scanner ob=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your number");
        int n=ob.nextInt();
        
        outer obb=new outer();
        obb.display(n);

	}

}
class outer{
    public class Inner{
        void show(int n)
        {
            int fact=1,i;
            for(i=1;i<=n;i++)
            {
            	fact=fact*i;
        }
         System.out.println("FACTORIAL="+fact);   
    }
}
void display(int n)
{
    Inner ob=new Inner();
    ob.show(n);
}
}
