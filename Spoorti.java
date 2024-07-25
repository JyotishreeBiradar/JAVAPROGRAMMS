class Spoorti
{
   public static String sendMsg(String name,String msg,double quantity)
   {
		
		System.out.println("start sendMsg in Spoorti");
		String ref2=Queue.accept(name,msg,quantity);
		System.out.println("ref:"+ref2);			
		System.out.println("end sendMsg in Spoorti");
		return "sent";
	}

}