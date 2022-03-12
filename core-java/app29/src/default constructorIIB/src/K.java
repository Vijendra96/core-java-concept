class K
{
	static int count;
	K()
	{
		System.out.println(count);
		count ++;
		System.out.println(count);
	}
	K(int i)
	{
		System.out.println(count);
		count ++;
		System.out.println(count);
	}
	K(int i, int j)
	{
		System.out.println(count);
		count ++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		K obj1 = new K();
		System.out.println("-------");
		K obj2 = new K();
		System.out.println("-------");
		K obj3 = new K(20);
		System.out.println("-------");
		K obj4 = new K();
		System.out.println("-------");
		K obj5 = new K(40);
		System.out.println("-------");
		K obj6 = new K(40, 50);
		System.out.println("-------");
		K obj7 = new K();
		System.out.println("-------");
		K obj8 = new K(4, 56);
		System.out.println("-------");
		System.out.println(count);
	}
}