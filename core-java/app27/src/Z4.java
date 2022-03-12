/*
	1. we can create an object in the return statement itself
*/
class Z4
{
	int i;
	static Z4 test()
	{
		System.out.println("from test");
		return new Z4();
	}
	public static void main(String[] args)
	{
		Z4 ref = test();
		System.out.println(ref.i);
	}
}
/*

class Z
{
int i;
static Z test()
{
System.out.println("from test");
return new Z();
}
public static void main(String[] args)
{
Z z1 = test();
System.out.println(z1.i);
}
}

*/