class L 
{
	public static void main(String[] args) 
	{
		int assert  = 10;
		System.out.println(assert);
	}
}

/*

E:\dec-batch-dev\app36\sr c>javac -d ../classes L.java
L.java:5: error: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
                int assert = 10;
                    ^
L.java:6: error: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
                System.out.println(assert);
                                   ^
2 errors

*/