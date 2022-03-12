package practicePackage;
class A
{
	private A()
	{

	}
	A(int i)
	{

	}
}
class L extends A
{
	L()
	{
		super(10);
	}
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}

/*
		We cant develop a sub class if super class containing only private constructors
*/

/*
done
*/