class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		assert false;
		System.out.println("main end");
	}
}


/*
	1.	by default, all assert statements are disabled
	2	to enable assert statments, we have to supply one VM argument
		-ea or -enableassertions.
	3.	we can also disable assertions explicitely by using another VM argument
		-da or -disableassertions.
	4.	enabling/disabling can be done
		1.  class wise
		2.  package and all of subpackages wise
		3.  entire execution wise
*/




/*
E:\dec-batch-dev\app36\src>java -cp ../classes -ea A
main begin
Exception in thread "main" java.lang.AssertionError
        at A.main(A.java:6)


E:\dec-batch-dev\app36\src>java -cp ../classes -enableassertions A
main begin
Exception in thread "main" java.lang.AssertionError
        at A.main(A.java:6)
*/