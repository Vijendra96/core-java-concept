class A
{
	static 
	{
		System.out.println("A-SIB");
	}
}
class B extends A
{
	static 
	{
		System.out.println("B-SIB");
	}
}
class C extends B
{
	static 
	{
		System.out.println("C-SIB");
	}
}

class R
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("done");
	}
}
/*
A-SIB
B-SIB
C-SIB
done
*/