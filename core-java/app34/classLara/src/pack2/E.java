package pack2;
import pack1.A;
class E 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
	}
}


/*

pack2\E.java:8: error: i is not public in A; cannot be accessed from outside package
                System.out.println(a1.i);
                                     ^
pack2\E.java:9: error: j has protected access in A
                System.out.println(a1.j);
                                     ^
2 errors

*/