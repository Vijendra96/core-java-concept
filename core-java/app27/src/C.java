class C 
{ 
	int i;   //non-static variable
	static 
	{
		i = 10;
	}
}







/*

error: non-static variable i cannot be referenced from a static context
                i = 10;
                ^

*/


/*
you can not use non static member inside the static context straigth away
*/
