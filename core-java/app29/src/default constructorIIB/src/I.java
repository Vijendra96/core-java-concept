class I
{
	int count;
	I()
	{
		count ++;
	}
	public static void main(String[] args)
	{
		I obj1 = new I();
		I obj2 = new I();
		I obj3 = new I();
		I obj4 = new I();
		I obj5 = new I();
		System.out.println(obj1.count);
		System.out.println(obj2.count);
		System.out.println(obj3.count);
		System.out.println(obj4.count);
		System.out.println(obj5.count);
	}
}
/*
1
1
1
1
1
*/