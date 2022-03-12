class I 
{
	I(int x)
	{
		System.out.println("I(int)");
	}
	I(double y)
	{
		System.out.println("I(double)");
	}
	I(int x, double y)
	{
		System.out.println("I(int, double)");
	}
	I(double y, int x)
	{
		System.out.println("I(double, int)");
	}
	public static void main(String[] args) 
	{
		I obj1 = new I(10);
		System.out.println("----------");
		I obj2 = new I(1.0);
		System.out.println("----------");
		I obj3 = new I(1, 1.0);
		System.out.println("----------");
		I obj4 = new I(1.0, 1);
		System.out.println("----------");
	}
}
/*
I(int)
----------
I(double)
----------
I(int, double)
----------
I(double, int)
----------
*/
