class L 
{
	static int i;
	L()
	{ 
		i ++;
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		L obj1 = new L();
		L obj2 = new L();
		L obj3 = new L();
		L obj4 = new L();
		System.out.println(L.i);
	}
}
/*
L()
L()
L()
L()
4
*/