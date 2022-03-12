class K
{
	int p;
	void test()
	{
		System.out.println("from test:"+ this);
		System.out.println("from test:"+ this.p);
	}
	public static void main(String[] args)
	{
		K obj1 = new K();
		K obj2 = new K();
		obj1.p = 10;
		obj2.p = 20;
		System.out.println("from main obj1 -->: "+ obj1);
		System.out.println("from main obj2 -->: "+ obj2);
		obj1.test();
		System.out.println("--------");
		obj2.test();
	}
}
/*
from main obj1 -->: K@452b3a41
from main obj2 -->: K@4a574795
from test:K@452b3a41
from test:10
--------
from test:K@4a574795
from test:20
*/