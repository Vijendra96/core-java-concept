class G
{
	int p;
	G()
	{
		p = 10;
		//we can develop any thing
	}
		public static void main(String[] args)
		{
		G obj1 = new G();
		G obj2 = new G();
		G obj3 = new G();
		G obj4 = new G();
		G obj5 = new G();
		System.out.println(obj1.p);//10
		System.out.println(obj2.p);//10
		System.out.println(obj3.p);//10
		System.out.println(obj4.p);//10
		System.out.println(obj5.p);//10
		obj1.p = 20;
		obj2.p = 30;
		obj3.p = 40;
		obj4.p = 50;
		obj5.p = 60;
		System.out.println(obj1.p);//20
		System.out.println(obj2.p);//30
		System.out.println(obj3.p);//40
		System.out.println(obj4.p);//50
		System.out.println(obj5.p);//60
	}
}