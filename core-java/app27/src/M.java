class M 
{
	int i;
	static M test1()
	{
		M arg = new M();
		arg.i = 1;
		System.out.println("from test-1 : " + arg.i);
		return arg;
	}
	static M test2()
	{
		M obj = test1();
		System.out.println("from test-2 : " + obj.i);
		obj.i = 2;
		return obj;
	}
	public static void main(String[] args) 
	{
		M ref = test2();
		System.out.println("from main : " + ref.i );
	}
}

/*
from test-1 : 1
from test-2 : 1
from main : 2
*/