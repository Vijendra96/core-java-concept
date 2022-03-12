class R 
{
	public static void main(String[] args) 
	{
		String s1 = null;
		String s2 = null;
		String s3 = s1 + s2;
		System.out.println(s3.length());
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}

/*

E:\dec-batch-dev\app39\src>java -cp ../classes R
8
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at R.main(R.java:9)


*/