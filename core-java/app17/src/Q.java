class Q
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		if(args.length < 3)
		{
		System.out.println("pls supply three int command line arg");
		return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int min = i < j ? (i < k ? i : k) : (j < k ? j : k);
		System.out.println("min value among " + i + ", " + j + " and " + k + " is " + min);
		System.out.println("main end");
	}
}
