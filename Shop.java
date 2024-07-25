class Shop

{
	
	public static void sendGift(String name,double price,String date,boolean urgent)
	
	{
		
		System.out.println("start sendGift in Shop");
		
		GiftShop.assign(name,price,date,urgent);
		
		System.out.println("end sendGift in Shop");
	}
	
	
	
}