class R 
{
	static int i = test1();
	static int j = test2();

	static int test1()
	{
		System.out.println("from test1 begin : "+ i + ", " +j);
		main(null);
		System.out.println("from test1 end: "+ i + ", " +  j);
		return i + j + 10;
	}
	static int test2()
	{
		System.out.println("from test2 begin : "+ i + ", " + j);
		main(null);
		System.out.println("from test2 end: "+ i + ", " + j);
		return i + j + 20;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main: "+ i + ", " + j);
		i += 1; // i = i + 1;
		j += 2; // j = j + 2;
	}
}

/*

from test1 begin : 0, 0
from main: 0, 0
from test1 end: 1, 2
from test2 begin : 13, 2
from main: 13, 2
from test2 end: 14, 4
from main: 14, 38

*/