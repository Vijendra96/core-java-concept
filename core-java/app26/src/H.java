class H 
{
	static
	{
		System.out.println("SIB : " + H.i);
	}
	static int i = 10;
	static int j = 10;
	public static void main(String[] args) 
	{
		System.out.println("main : " + i + ", " + j);
	}
}
