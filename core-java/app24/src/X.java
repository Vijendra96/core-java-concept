class X
{
	static int i = test1();
	static int j = test2();
	static int test1()
	{
		System.out.println("test1 begin:" + i + ", " + j);
		i += i + j + 1;
		j += i + i + 2;
		main(null);
		System.out.println("test1 end:" + i);
		return i + j + 3;
	}
		static int test2()
	{
		System.out.println("test2 begin:" + i + ", " + j);
		i += j + 1;
		j += i + 2;
		main(null);
		System.out.println("test2 end:" + i);
		return i + j + 4;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:" + i + " , " + j);
		i += j + 5;
		j += i + 6;
		System.out.println("from end:" + i + " , " + j);
	}
}

/*

test1 begin:0, 0
from main:1 , 4
from end:10 , 20
test1 end:10
test2 begin:33, 20
from main:54 , 76
from end:135 , 217
test2 end:135
from main:135 , 356
from end:496 , 858
*/

