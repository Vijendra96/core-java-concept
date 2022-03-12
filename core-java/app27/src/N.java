class N
{
	int p;
	double q;
	public static void main(String[] args)
	{
		N objRef = new N();
		System.out.println(objRef.p);
		System.out.println(objRef.q);
		objRef.p = 10;
		objRef.q = 25.0;
		System.out.println(objRef.p);
		System.out.println(objRef.q);
	}
}

/*
0
0.0
10
25.0
*/