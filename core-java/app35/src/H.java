abstract class A
{
	abstract void test1();
}
class H extends A
{
	int test1()
	{
		System.out.println("from test1()");
		return 30;
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test1();
		System.out.println("done");
	}
}

/*

E:\dec-batch-dev\app35\src>javac -d ../classes H.java
H.java:5: error: H is not abstract and does not override abstract method test1() in A
class H extends A
^
H.java:7: error: test1() in H cannot override test1() in A
        int test1()
            ^
  return type int is not compatible with void
2 errors

*/