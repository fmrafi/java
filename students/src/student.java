
public class student {
	private int id;
	private Brithdate brithdate;
	public student(int ssn,int year, int month, int day) 
	{
		id = ssn;
		brithdate = new Brithdate(year,month, day);
	}
	public int getId() 
	{
		return id;
	}
	public Brithdate getBrithdate()
	{
		return brithdate;
	}

}
