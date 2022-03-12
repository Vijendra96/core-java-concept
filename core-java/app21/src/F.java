class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i <= 5)
		{
		System.out.println("body begin " + i);
		if(i == 3)
		{
			continue;
		}
		System.out.println("body end" + i);
		i++;
		}
		System.out.println("main end");
	}
}

/*

it is an infinite loop becouse when i will become 3 then line number 14 and 15 will not going to execute, 
becouse of "continue" so i = 3 will constant for all time.


*/