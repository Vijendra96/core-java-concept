class O 
{
	public static void main(String[] args) 
	{
		String s1 = NULL;
		System.out.println(s1.length());
	}
}


/*

E:\dec-batch-dev\app39\src>javac -d ../classes O.java
O.java:5: error: cannot find symbol
                String s1 = NULL;
                            ^
  symbol:   variable NULL
  location: class O
1 error

*/