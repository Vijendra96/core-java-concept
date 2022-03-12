class K 
{
	K()
	{
		System.out.println("K()");
	}
	K(int i)
	{
		this();
		System.out.println("K(int)");
	}
	{
		System.out.println("IIB-1");
	}
	{
		System.out.println("IIB-2");
	}

	public static void main(String[] args) 
	{
		K obj1 = new K();
		System.out.println("----------");
		K obj2 = new K(300);
		System.out.println("----------");
		K obj3 = new K();
		System.out.println("----------");
	}
}
/*
IIB-1
IIB-2
K()
----------
IIB-1
IIB-2
K()
K(int)
----------
IIB-1
IIB-2
K()
----------
*/