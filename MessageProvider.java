class MessageProvider
{
	
	public static boolean send(String name,String msg)
	{
	System.out.println("start send in MessageProvider");
	System.out.println("Name:"+name + "&" + "Msg:"+msg);
	
	if(name=="Ambani" && msg=="Do well")
	{
		System.out.println("Ambani Do well");
		return true;
	}
		
		
	System.out.println("end send in MessageProvider");
	return true;
	}
	
	
}