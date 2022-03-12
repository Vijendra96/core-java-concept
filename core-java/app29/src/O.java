class O 
{
	O(int i)
	{
		//code
	}
	public static void main(String[] args) 
	{
		O o1 = new O();
		System.out.println("done");
	}
}

/*
O.java:9: error: constructor O in class O cannot be applied to given types;
                O o1 = new O();
                       ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
*/