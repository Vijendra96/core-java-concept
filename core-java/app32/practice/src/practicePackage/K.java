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
class K extends A
{
	K()
	{

	}
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}

/*
practicePackage\K.java:16: error: constructor A in class A cannot be applied to given types;
        {
        ^
  required: no arguments
  found:    no arguments
  reason: A() has private access in A
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/