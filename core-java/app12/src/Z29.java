class Z29 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
			System.out.println("if stmt1");
			System.out.println("if stmt2");
			System.out.println("if stmt3");
			System.out.println("if stmt4");
		System.out.println("main end");
	}
}


/* 
there is, in the line number 6, if has no opening and closing braces, so the first SOP is considered as the statement of
if. therefor First SOP is not going to print becouse if has false.
and now from Second SOP to Last SOP are going to print same as it.
*/