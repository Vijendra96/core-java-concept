class P
{
	P()
	{
		this(9.1);//3
		System.out.println("P()");//5
	}
	P(int i)
	{
		this(9, i);//1
		System.out.println("P(int)");//7
	}
	P(int i, int j)
	{
		this();//2
		System.out.println("P(int, int)");//6
	}
	P(double i)
	{
		System.out.println("P(double)");//4
	}
	public static void main(String[] args)
	{
		P ref1 = new P();
		System.out.println("------------");
		P ref2 = new P(10);
		System.out.println("------------");
		P ref3 = new P(1.5);
		System.out.println("------------");
		P ref4 = new P(5, 7);
		System.out.println("------------");
	}
}
/*
P(double)
P()
------------
P(double)
P()
P(int, int)
P(int)
------------
P(double)
------------
P(double)
P()
P(int, int)
------------
*/