class G extends Object
{
	G()
	{
		super();
		System.out.println("G()");
	}
}
class H extends G
{
	H()
	{
		super();
		System.out.println("H()");
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
	}
}
/*
G()
H()
*/