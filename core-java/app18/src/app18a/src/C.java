class C
{
	enum Days {MON, TUE, WED, THR, FRI, SAT, SUN};
	public static void main(String[] args)
	{
		System.out.println("main begin");
		Days d1 = Days.WED;
		switch(d1)
		{
			case MON:
				System.out.println("case for MON");
				break;

			case TUE:
				System.out.println("case for TUE");
				break;

			case WED:
				System.out.println("case for WED");
				break;

			case THR:
				System.out.println("case for THR");
				break;

			case FRI:
				System.out.println("case for FRI");
				break;

			case SAT:
				System.out.println("case for SAT");
				break;

			case SUN:
				System.out.println("case for SUN");
				break;

			default:
				System.out.println("i am from default");
		}
		System.out.println("main end");
	}
}