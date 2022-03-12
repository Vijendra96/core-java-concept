class D 
{
	static int i = test1();
	static
	{
		System.out.println("SIB1:" + i);
		i += 1;
	}
	static
	{
		System.out.println("SIB2 begin:" + i);
		i += 2;
		i += test1();
		i = i + test1();
		// i = 15 + 27;
		System.out.println("SIB2 end:" + i);
	}
	public static int test1()
	{
		System.out.println("from test1:" + i);
		i += 3;
		main(null);
		return i + 4;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:" + i);
		i += 5;
	}
}

/*

from test1:0
from main:3
SIB1:12
SIB2 begin:13
from test1:15
from main:18
from test1:42
from main:45
SIB2 end:96
from main:96

*/
