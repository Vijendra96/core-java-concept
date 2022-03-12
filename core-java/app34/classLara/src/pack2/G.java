package pack2;
import pack1.A;
public class G extends A 
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		//System.out.println(g1.i);
		System.out.println(g1.j);
		System.out.println(g1.k);
	}
}

/*

pack2\G.java:8: error: i is not public in A; cannot be accessed from outside package
                System.out.println(g1.i);
                                     ^
1 error

*/