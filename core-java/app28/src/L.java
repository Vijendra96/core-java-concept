/*
	1. this is not available in any static context. we should not use "this" inside a static context.
	2. "this" is only for reference to the current object.
	3. static methods are not calling through an object. thats why this is not available inside a static context.
*/


class L
{
	static void test()
	{
		System.out.println("test:"+ this);
	}
	static
	{
		System.out.println("SIB:"+ this);
	}
	public static void main(String[] args)
	{
		System.out.println("main:" + this);
	}
}
/*
J.java:5: error: non-static variable this cannot be referenced from a static context
 System.out.println("test:"+ this);
 ^
J.java:10: error: non-static variable this cannot be referenced from a static context
 System.out.println("SIB:"+ this);
 ^
J.java:15: error: non-static variable this cannot be referenced from a static context
 System.out.println("main:" + this);
 */