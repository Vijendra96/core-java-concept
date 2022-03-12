class S 
{
	public static void main(String[] args) 
	{
		String s1 = null;
		String s2 = s1 + "abc";
		String s3 = s1 + 10;
		String s4 = s1 + null;
		String s5 = null + null;
		String s6 = 10 + 20;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}

/*

E:\dec-batch-dev\app39\src>javac -d ../classes S.java
S.java:9: error: bad operand types for binary operator '+'
                String s5 = null + null;
                                 ^
  first type:  <null>
  second type: <null>
S.java:10: error: incompatible types: int cannot be converted to String
                String s6 = 10 + 20;
                               ^
2 errors

*/