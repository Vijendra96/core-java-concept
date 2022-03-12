class J 
{
	J(int i, int j)
	{
		System.out.println("J(int, int)");
	}
	J(String i, int j)
	{
		System.out.println("J(String, int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		J j1 = new J(10, 20);
		System.out.println("----------");
		J j2 = new J(1, 200);
		System.out.println("----------");
		J j3 = new J("abc", 200);
		System.out.println("----------");
		J j4 = new J("xyz", 400);
		System.out.println("----------");
		System.out.println("main end");
	}
}
/*
main begin
J(int, int)
----------
J(int, int)
----------
J(String, int)
----------
J(String, int)
----------
main end
*/