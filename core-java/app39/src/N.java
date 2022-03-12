class N 
{
	public static void main(String[] args) 
	{
		String s1 = null;
		String s2 = null;
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}


/*

E:\dec-batch-dev\app39\src>java -cp ../classes N
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at N.main(N.java:7)

*/