class C 
{
	int i;
	C()
	{
		System.out.println("from constructor");
		this.i = 100;
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("-----------");
		C c2 = new C();
		System.out.println("-----------");
		C c3 = new C();
		System.out.println("-----------");
		C c4 = new C();
		System.out.println("-----------");
		System.out.println(c1.i + ", " + c2.i + ", " + c3.i + ", " + c4.i);
	}
}

/*
from constructor
-----------
from constructor
-----------
from constructor
-----------
from constructor
-----------
100, 100, 100, 100
*/