class U 
{
	int i;
	U()
	{
		this(90);
		System.out.println("U()");
	}
	U(int i)
	{
		this.i = i;
		System.out.println("U(int)");
	}
	public static void main(String[] args) 
	{
		U u1 = new U();
		System.out.println("----------");
		U u2 = new U(90);
	}
}
/*
U(int) 
U()
----------
U(int)
*/