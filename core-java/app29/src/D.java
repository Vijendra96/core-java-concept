class D 
{
	int i;
	D()
	{
		System.out.println("from constructor");
		i = 100;
	}
	public static void main(String[] args) 
	{
		D obj1 = new D();
		System.out.println("-----------");
		D obj2 = new D();
		System.out.println("-----------");
		D obj3 = new D();
		System.out.println("-----------");
		D obj4 = new D();
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
100, 100, 100, 100
*/