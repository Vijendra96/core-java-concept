class U  
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		for(i = 1, System.out.println("initialization with " + i); 
		test(i); 
		System.out.println("before change " + i), i++, System.out.println("after change " + i))            
		{
		System.out.println("Hello: " + i);
		}
		System.out.println("main end: " + i);
	}
	static boolean test(int i)
	{
		boolean b1 = (i <= 4);
		System.out.println("from test: boolean value for " + i + ": " + b1);
		return b1;
	}
}


/*

main begin
initialization with 1
from test: boolean value for 1: true
Hello: 1
before change 1
after change 2
from test: boolean value for 2: true
Hello: 2
before change 2
after change 3
from test: boolean value for 3: true
Hello: 3
before change 3
after change 4
from test: b oolean value for 4: true
Hello: 4
before change 4
after change 5
from test: boolean value for 5: false
main end: 5

*/