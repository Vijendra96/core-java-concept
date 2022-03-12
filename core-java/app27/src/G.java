
//multiple reference to the same object

class G 
{
	int i;
	public static void main(String[] args) 
	{
		G ref = new G();
		G obj = ref;
		G g1 = ref;
		G g2 = g1;
		G g3 = obj;
		g1.i =10;
		System.out.println(ref.i);	//10
		System.out.println(obj.i);	//10
		System.out.println(g1.i);	//10
		System.out.println(g2.i);	//10
		System.out.println(g3.i);	//10
	}
}


/*

NOTE :  same object can be reffered by any number of references.

*/