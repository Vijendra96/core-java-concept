class M
{
	int i;
	double j;
	M(int i)
	{
		this.i = i;
	}
	M(double j)
	{
		this.j = j;
	}
	M(int i, double j)
	{
		this.i = i;
		this.j = j;
	}
	void printObjectState()
	{
		System.out.println(i + ", " + j);
	}
	public static void main(String[] args)
	{
		M ref1 = new M(10);
		System.out.println("---------");
		M ref2 = new M(1.5);
		System.out.println("---------");
		M ref3 = new M(100, 7.5);
		System.out.println("---------");
		ref1.printObjectState();
		ref2.printObjectState();
		ref3.printObjectState();
	}
}
/*
---------
---------
---------
10, 0.0
0, 1.5
100, 7.5
*/