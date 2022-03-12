class M 
{
	static int i;
	M()
	{ 
		i ++;
		System.out.println("M()");
	}
	M(int x)
	{ 
		i ++;
		System.out.println("M(int)");
	}
	public static void main(String[] args) 
	{
		M obj1 = new M();
		M obj2 = new M();
		M obj3 = new M(30);
		M obj4 = new M(20);
		System.out.println(M.i);
	}
}
/*
L()
M()
M()
M(int)
M(int)
4
*/