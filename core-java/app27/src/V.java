/*
	1. object can be refered from different methods.
	2. object can be refered by multiple references.
	   All these references can be from the same method or from different methods
*/


class V
{
	int i;
	static void test(V v1)
	{
		System.out.println("test begin:"+ v1.i);
		v1.i = 10;
		System.out.println("test end:"+ v1.i);
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		V obj = new V();
		obj.i = 5;
		test(obj);
		System.out.println("main end:" + obj.i);
	}
} 

/*
main begin
test begin:5
test end:10
main end:10
*/