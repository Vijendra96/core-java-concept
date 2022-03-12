class Z15 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A t1 = test();
		System.out.println("main end : ");
	}
	static A test()
	{
		System.out.println("I am from test");
		return null;
	}
}
class A
{

}


/*

main begin
I am from test
main end :


*/