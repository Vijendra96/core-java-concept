class T 
{
	T()
	{
		this(90);
		System.out.println("T()");
	}
	T(int i)
	{
		this(90, i);
		System.out.println("T(int)");
	}
	T(int i, int j)
	{
		System.out.println("T(int, int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		T t1 = new T(9, 90);
		System.out.println("------------");
		T t2 = new T(9);
		System.out.println("------------");
		T t3 = new T();
		System.out.println("------------");
		System.out.println("main end");
	}
}
/*
main begin
T(int, int)
------------
T(int, int)
T(int)
------------
T(int, int)
T(int)
T()
------------
main end
*/