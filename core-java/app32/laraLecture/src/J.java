class I
{
	private int x;
}
class J extends I
{
	public static void main(String[] args) 
	{
		J obj = new J();
		System.out.println(obj.x);
	}
}


/*

J.java:10: error: x has private access in I
                System.out.println(obj.x);
                                      ^
1 error

*/