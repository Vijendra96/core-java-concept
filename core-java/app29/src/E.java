class E 
{
	int i;
	E(int arg)
	{
		System.out.println("from constructor");
		i = arg;
	}
	public static void main(String[] args) 
	{
		E obj1 = new E(10);
		System.out.println("-----------");
		E obj2 = new E(20);
		System.out.println("-----------");
		E obj3 = new E(30);
		System.out.println("-----------");
		E obj4 = new E(40);
		System.out.println("-----------");
		System.out.println(obj1.i + ", " + obj2.i + ", " + obj3.i + ", " + obj4.i);
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
10, 20, 30, 40

*/