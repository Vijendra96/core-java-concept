class H
{
	static int count;
	H()
	{
		count ++;
		//System.out.println(count);
	}
	public static void main(String[] args)
	{
		H obj1 = new H();
		H obj2 = new H();
		H obj3 = new H();
		H obj4 = new H();
		H obj5 = new H();
		System.out.println(count);
	}
}
/*
5
*/