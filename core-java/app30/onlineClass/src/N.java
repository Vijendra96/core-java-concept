class N 
{
	static int i;
	N()
	{ 
		i ++;
		System.out.println("N()");
	}
	N(int x)
	{ 
		i ++;
		System.out.println("N(int)");
	}
	N(int x, int y)
	{ 
		i ++;
		System.out.println("N(int, int)");
	}
	public static void main(String[] args) 
	{
		N obj1 = new N();
		N obj2 = new N();
		N obj3 = new N(30);
		N obj4 = new N(20);
		N obj5 = new N(20, 5);
		N obj6 = new N(20, 200);
		System.out.println(N.i);
	}
}
/*
N()
N()
N(int)
N(int)
N(int, int)
N(int, int)
6
*/