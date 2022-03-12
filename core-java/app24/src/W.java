class W
{
	static int i = test1();
	static int j = test2();
	static int test1()
	{
		System.out.println("test1 begin:" + i + ", " + j);
		i += j + 1;
		j += i + 2;
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
from main:1 , 3
from end:9 , 18
test1 end:9
test2 begin:30, 18
from main:49 , 69
from end:123 , 198
test2 end:123
from main:123 , 325
from end:453 , 784
*/

