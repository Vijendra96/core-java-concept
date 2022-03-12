class G
{
	{
		System.out.println("IIB");
	}
	G()
	{
		this(10);
		System.out.println("G()");
	}
	G(int i)
	{
		this(i, i);
		System.out.println("G(int)");
	}
	G(int i, int j)
	{
		System.out.println("G(int, int)");
	}
		public static void main(String[] args)
	{
		System.out.println("main begin");
		G g1 = new G();
		System.out.println("-----------");
		G g2 = new G(10);
		System.out.println("-----------");
		G g3 = new G(10, 20);
		System.out.println("-----------");
		System.out.println("main end");
	}
}
/*
main begin
IIB
G(int, int)
G(int)
G()
-----------
IIB
G(int, int)
G(int)
-----------
IIB
G(int, int)
-----------
main end
*/