class O
{
	int a;
	double b;
	boolean c;
	public static void main(String[] args)
	{
		O o1 = new O();
		System.out.println(o1.a);
		System.out.println(o1.b);
		System.out.println(o1.c);
		o1.a = 100;
		o1.b = 15.5;
		o1.c = true;
		System.out.println(o1.a);
		System.out.println(o1.b);
		System.out.println(o1.c);
	}
}
/*
0
0.0
false
100
15.5
true
*/