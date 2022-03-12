package pack3;
import pack2.H;
class J extends H
{
	public static void main(String[] args)
	{
		J obj = new J();
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
}

/*

E:\dec-batch-dev\app34\practice\src>javac -d ../classes pack3/J.java
.\pack2\H.java:7: error: x is not public in A; cannot be accessed from outside package
                System.out.println(obj.x);
                                      ^
1 error

*/