class E 
{
	private E() 
	{
		System.out.println("E()");
	}
}
class F
{
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("done");
	}
}



/*
F.java:12: error: E() has private access in E
                E e1 = new E();
                       ^
1 error
*/