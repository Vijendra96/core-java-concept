class S 
{
	static int i = test1();
	static int j = test2();

	static int test1()
	{
		System.out.println("from test1 begin : "+ i + ", " +j);
		i += i + j + 1; //i = i + i + j + 1;
		j += i + j + 2; //j = j + i + j + 2;
		main(null);
		System.out.println("from test1 end: "+ i + ", " +  j);
		return i + j + 10;
	}
	static int test2()
	{
		System.out.println("from test2 begin : "+ i + ", " + j);
		i += i + j + 3; //i= i + i + j + 3;
		j += i + j + 4; //j = j + i + j + 4;
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
from main: 1, 3
from test1 end: 2, 5
from test2 begin : 17, 5
from main: 42, 56
from test2 end: 43, 58
from main: 43, 121

*/