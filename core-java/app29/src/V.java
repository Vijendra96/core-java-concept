class V 
{
	V()
	{
		System.out.println("V()");
		this(90);
	}
	V(int i)
	{
		System.out.println("V(int)");
	}
	public static void main(String[] args) 
	{
		V v1 = new V();
		System.out.println("----------");
		V v2 = new V();
	}
}
