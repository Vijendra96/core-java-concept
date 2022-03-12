class K
{
	int p;
	double q;
	K(int p, double q)
	{
		this.p = p;
		this.q = q;
		//we can develop any thing
	}
	public static void main(String[] args)
	{
		K obj1 = new K(1, 5.4);
		K obj2 = new K(20, 30.0);
		K obj3 = new K(40, 5.0);
		K obj4 = new K(200, 2.05);
		K obj5 = new K(5, 50.1);
		System.out.println(obj1.p + ", " + obj1.q);//1, 5.4
		System.out.println(obj2.p + ", " + obj2.q);//20, 30.0
		System.out.println(obj3.p + ", " + obj3.q);//40, 5.0
		System.out.println(obj4.p + ", " + obj4.q);//200, 2.05
		System.out.println(obj5.p + ", " + obj5.q);// 5, 50.1
		obj1.p = 20;
		obj1.q = 2.0;
		obj2.p = 30;
		obj2.q = 3.0;
		obj3.p = 40;
		obj3.q = 4.0;
		obj4.p = 50;
		obj4.q = 5.0;
		obj5.p = 60;
		obj5.q = 6.0;
		System.out.println(obj1.p + ", " + obj1.q);//20, 2.0
		System.out.println(obj2.p + ", " + obj2.q);//30, 3.0
		System.out.println(obj3.p + ", " + obj3.q);//40, 4.0
		System.out.println(obj4.p + ", " + obj4.q);//50, 5.0
		System.out.println(obj5.p + ", " + obj5.q);//60, 6.0
	}
}