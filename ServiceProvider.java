class ServiceProvider
{
	
	public static boolean send(String name,String msg)
	{
		
		System.out.println("start send in ServiceProvider");
		boolean ref=MessageProvider.send(name,msg);
		System.out.println("ref:"+ref);
		
		System.out.println("end send in ServiceProvider");
		return ref;
	}
	
	
}