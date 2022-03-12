class D 
{
	int i;
	void test()
	{
		System.out.println("from test : " + i);	//System.out.println("from test : " + this.i);
		i = 100; // this.i = 100;
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("from main - 1 : " + d1.i);
		d1.i = 20;
		d1.test();
		System.out.println("from main - 2 : " + d1.i);
	}
}

/*

from main - 1 : 0
from test : 20
from main - 2 : 100

*/