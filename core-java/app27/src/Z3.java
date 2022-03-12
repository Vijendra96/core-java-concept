class Z3
{
	int i;
	static void test(Z3 ref3, Z3 ref4)
	{
		System.out.println("from test:" + ref3.i + ", " + ref4.i);
	}
	public static void main(String[] args)
	{
		Z3 ref1 = new Z3();
		Z3 ref2 = new Z3();
		ref1.i = 10;
		ref2.i = 20;
		test(ref1, ref2);
		test(ref1, new Z3());
		test(new Z3(), ref1);
		test(new Z3(), ref2);
		test(new Z3(), new Z3());
		test(ref1, new Z3());
		test(ref2, new Z3());
		//test(ref1.i, ref2.i);
		System.out.println("end");
	}
}
/*
from test:10, 20
from test:10, 0
from test:0, 10
from test:0, 20
from test:0, 0
from test:10, 0
from test:20, 0
end
*/