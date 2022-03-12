abstract class A
{
	abstract int test1();
}
class I extends A
{
	int test1()
	{
		System.out.println("from test1()");
		return 30;
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test1();
		System.out.println("done");
	}
}

/*
from test1()
done
*/
