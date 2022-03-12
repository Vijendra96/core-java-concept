class M 
{
	public static void main(String[] args) 
	{
		String s1 = null;
		String s2;
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}


/*

E:\dec-batch-dev\app39\src>javac -d ../classes M.java
M.java:8: error: variable s2 might not have been initialized
                System.out.println(s2.length());
                                   ^
1 error

*/