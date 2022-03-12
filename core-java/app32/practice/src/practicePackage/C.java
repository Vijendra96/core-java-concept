package practicePackage;
class C 
{
	private C()
	{
		System.out.println("I am private constructor C()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c = new C();
		System.out.println("main end");
	}
}


/*

		main begin
		I am private constructor
		main end

*/