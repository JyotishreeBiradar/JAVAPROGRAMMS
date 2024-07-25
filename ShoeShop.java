class ShoeShop
{
	 public static double purchase(String brand)
	
	{
		System.out.println("start purchase in ShoeShop");
		double ref=ShoeFactory.order("Puma");
		
		System.out.println("ref:"+ref);
		System.out.println("end purchase in ShoeShop");
		return ref;
	}
}
		