class H 
{
	H()
	{
		System.out.println("H()");
	}
	H(int i)
	{
		System.out.println("H(int)");
	}
	H(double j)
	{
		System.out.println("H(double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 = new H();
		System.out.println("-------------");
		H h2 = new H(23);
		System.out.println("-------------");
		H h3 = new H(2.3);
		System.out.println("-------------");
		System.out.println("main end");
	}
}

/*
H(int)
-------------
H(double)
-------------
main end
*/
//multiple ways of object creation.