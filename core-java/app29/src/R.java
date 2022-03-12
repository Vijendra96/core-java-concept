class R 
{
	R()
	{
		this(9);
		System.out.println("R()");
	}
	R(int i)
	{
		System.out.println("R(int)");
	}
	public static void main(String[] args) 
	{
		R r1 = new R();
		System.out.println("----------");
		R r2 = new R(90);
	}
}
/*
R(int)
R()
----------
R(int)
*/