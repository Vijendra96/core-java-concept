class J 
{
	J()
	{
		System.out.println("J()");
	}
	J(int i)
	{
		this;
		System.out.println("---------");
		System.out.println("J(int)");
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) 
	{
		J obj1 = new J();
		System.out.println("----------");
		J obj2 = new J(300);
		System.out.println("----------");
		J obj3 = new J();
		System.out.println("----------");
	}
}
/*
IIB
J()
----------
IIB
J(int)
----------
IIB
J()
----------
*/