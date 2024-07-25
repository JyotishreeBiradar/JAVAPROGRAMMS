class ShoeFactory
{
	 public static double order(String brand)
	
	{
		System.out.println("start order in ShoeFactory");
		
		System.out.println("Brand:"+brand);
		
		if (brand=="Puma")
		{
			System.out.println("Puma");
			return 1500;
		}
		if(brand=="Nike")
		{
			System.out.println("Nike");
			return 2000;
		}
		
		System.out.println("end order in ShoeFactory");
		return 0;
		
	}
	
	
}