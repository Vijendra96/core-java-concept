interface S
{
	private int i = 10;
	protected void test1();

}

//compile time error

					//interface memebers are public by default,
					//interface members can not be othar than public.



/*

S.java:3: error: modifier private not allowed here
        private int i = 10;
                    ^
S.java:4: error: modifier protected not allowed here
        protected void test1();
                       ^
2 errors

*/