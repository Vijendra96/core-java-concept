package pack2;
import pack1.A;
class F extends A
{
	public static void main(String[] args)
	{
		A obj = new A();
		//System.out.println(obj.x);
		//System.out.println(obj.y);
		System.out.println(obj.z);
	}
}

/*

pack2\F.java:8: error: x is not public in A; cannot be accessed from outside package
                System.out.println(obj.x);
                                      ^
pack2\F.java:9: error: y has protected access in A
                System.out.println(obj.y);
                                      ^
2 errors

*/


/*
0

*/