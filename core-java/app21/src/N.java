class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		while(i-- >= 5)
		{
		System.out.println("while loop : " + i);
		}
		System.out.println("main end : " + i);
	}
}


/*
output:
main begin
while loop : 9
while loop : 8
while loop : 7
while loop : 6
while loop : 5
while loop : 4
main end : 3
*/