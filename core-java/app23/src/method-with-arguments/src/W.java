class W 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		for(i = 1, System.out.println("init:" + i);
		 test(i);
		System.out.println("before change:" + i), i++,
		System.out.println("after change:" + i))
	{
		System.out.println("loop body:" + i);
	}
		System.out.println("main end");
	}
		public static boolean test(int i)
	{
		boolean flag = i <= 3;
		System.out.println("boolean result for :" + i + " is " + flag);
		return flag;
	}
}

/*

main begin
init:1
boolean result for :1 is true
loop body:1
before change:1
after change:2
boolean result for :2 is true
loop body:2
before change:2
after change:3
boolean result for :3 is true
loop body:3
before change:3
after change:4
boolean result for :4 is false
main end

*/