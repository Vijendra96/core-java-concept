abstract class A
{
	int test1()
	{
		System.out.println("A-from test1()");
		return 10;
	}
}
class K extends A
{
	int test1() //default access modifier is not allowed  
	{
		System.out.println("K-from test1()");
		return 30;
	}
	
	public static void main(String[] args) 
	{
		K obj = new K();
		int i = obj.test1();
		System.out.println("done : " + i);
	}
}

/*

J-from test1()
done : 30

*/