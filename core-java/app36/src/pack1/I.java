package pack1;
class I 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin in I");
		assert false;
		pack1.pack11.J.main(args);
		System.out.println("------------");
		pack2.K.main(args);
		System.out.println("main end in I");
	}
}

/*
E:\dec-batch-dev\app36\src>java -cp ../classes pack1.I
main begin in I
main begin in J
main end in J
------------
main begin in K
main end in K
main end in I


E:\dec-batch-dev\app36\src>java -cp ../classes -ea pack1.I
main begin in I
Exception in thread "main" java.lang.AssertionError
        at pack1.I.main(I.java:7)


main begin in I
main begin in J
main end in J
------------
main begin in K
Exception in thread "main" java.lang.AssertionError
        at pack2.K.main(K.java:7)
        at pack1.I.main(I.java:10)


E:\dec-batch-dev\app36\src>java -cp ../classes -ea -da:pack1.I pack1.I
main begin in I
main begin in J
Exception in thread "main" java.lang.AssertionError
        at pack1.pack11.J.main(J.java:7)
        at pack1.I.main(I.java:8)

*/