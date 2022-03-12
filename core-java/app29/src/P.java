class P 
{
	P()
	{

	}
	public static void main(String[] args) 
	{
		P p1 = new P(9);
		System.out.println("Hello World!");
	}
}

/*
P.java:9: error: constructor P in class P cannot be applied to given types;
                P p1 = new P(9);
                       ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
1 error
*/