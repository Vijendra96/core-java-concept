class M 
{
     int i;
        	M(int k)
        	{
              		System.out.println("M(int)");
              		i = k;
        	}
       	public static void main(String[] args) 
        	{
              		System.out.println("main begin");
              		M obj1 = new M(10);
              		System.out.println("---------");
              		M obj2 = new M(50);
              		System.out.println("---------");
              		M obj3 = new M(20);
              		System.out.println("---------");
              		System.out.println(obj1.i + ", " + obj2.i + "," + obj3.i);
              		System.out.println("main end");
        	}
}

/*

main begin
M(int)
---------
M(int)
---------
M(int)
---------
10, 50,20
main end

*/