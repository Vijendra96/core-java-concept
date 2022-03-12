class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		assert false : "something went wrong";
		System.out.println("main end");
	}
}


/*

E:\dec-batch-dev\app36\src>java -cp ../classes -ea C
main begin
Exception in thread "main" java.lang.AssertionError: something went wrong
        at C.main(C.java:6)

*/