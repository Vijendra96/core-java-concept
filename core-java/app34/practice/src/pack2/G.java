package pack2;
import pack1.A;
class G extends A
{
	public static void main(String[] args)
	{
		G obj = new G();
		//System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
}

/*

pack2\G.java:8: error: x is not public in A; cannot be accessed from outside package
                System.out.println(obj.x);
                                      ^
1 error

*/


/*
	0
	0
*/