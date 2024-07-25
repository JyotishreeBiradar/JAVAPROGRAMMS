class Queue
{
	public static String accept(String name,String msg,double quantity)
	{
		
		System.out.println("start accept in Queue");
		boolean ref1=ServiceProvider.send(name,msg);
		System.out.println("ref:"+ref1);
		System.out.println("Quantity:+quantity");
		if (quantity==3)
        {
		System.out.println(quantity);
		return "sent";
		}			
	
		System.out.println("end accept in Queue");
		return "Notsent";
	}
	
	
	
	
}