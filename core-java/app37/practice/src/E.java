interface E
{
	public int i = 0;
	static int j = 0;
	static public int k = 0;
	static final int m = 0;
	static public int n = 0;
	final static public int p = 0;
	static final public int q = 0;
	int r = 90;
}




/*
	1. all interface attributes are public by default. no need of public keyword explicitely.
	2. all interface attributes are static by default. no need of static keyword explicitely.
	3. all interface attributes are final by default. no need of final keyword explicitely.
	4. public, static, final can be in any order
*/