class R
{
	int i;
	public static void main(String[] args)
	{
		M m1 = new M();
		M m2 = m1;
		M m3 = new M();
		M m4 = m3;
		System.out.println(m1.i + ", " + m2.i + ", " + m3.i + ", " + m4.i);
		m1.i = 1;
		System.out.println(m1.i + ", " + m2.i + ", " + m3.i + ", " + m4.i);
		m2.i = 2;
		System.out.println(m1.i + ", " + m2.i + ", " + m3.i + ", " + m4.i);
		m3.i = 3;
		System.out.println(m1.i + ", " + m2.i + ", " + m3.i + ", " + m4.i);
		m4.i = 4;
		System.out.println(m1.i + ", " + m2.i + ", " + m3.i + ", " + m4.i);
	}
}
/*
0, 0, 0, 0
1, 1, 0, 0
2, 2, 0, 0
2, 2, 3, 3
2, 2, 4, 4
*/