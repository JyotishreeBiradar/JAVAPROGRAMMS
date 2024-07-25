class Customer
{
	
	public static boolean travel()
	{
	System.out.println("start travel in Customer");
	
	boolean ref2=Agency.advanceBook();
     
	System.out.println("end travel in Customer");
	
	return ref2;
	}
	
	
	
}