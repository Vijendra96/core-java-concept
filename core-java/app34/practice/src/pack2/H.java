package pack2;
public class H extends G
{
	public static void main(String[] args)
	{
		H obj = new H();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
}

/*
pack2\H.java:7: error: x is not public in A; cannot be accessed from outside package
                System.out.println(obj.x);
                                      ^
1 error


*/


/*
	0
	0
*/