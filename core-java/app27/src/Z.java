class Z
{
	int i;
	static Z test(Z arg)
	{
		System.out.println("from test:"+ arg.i);
		arg.i = 20;
		return arg;
	}
	public static void main(String[] args) 
	{
		Z z1 = new Z();
		z1.i = 10;
		Z z2 = test(z1);
		System.out.println("from test::" + z1.i + ", " + z2.i);
	}
}
/*
from test:10
from test::20, 20
*/