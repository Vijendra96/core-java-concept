abstract class A
{
	int test1()
	{
		System.out.println("A-from test1()");
		return 10;
	}
}
class J extends A
{
	int test1()
	{
		System.out.println("J-from test1()");
		return 30;
	}
	
	public static void main(String[] args) 
	{
		J j1 = new J();
		int i = j1.test1();
		System.out.println("done : " + i);
	}
}

/*

J-from test1()
done : 30

*/