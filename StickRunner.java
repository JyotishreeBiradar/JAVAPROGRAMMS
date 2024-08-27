class StickRunner
{
	public static void main(String[] args)
	  {
		System.out.println("start main in StickRunner");
		
		SelfieStick ref=new SelfieStick();
		System.out.println("default value:"+ref.price);
		
		SelfieStick ref1=new SelfieStick();
		System.out.println("width is in mm:"+ref1.width);
		
		
		System.out.println("end main in StickRunner");
	}
}