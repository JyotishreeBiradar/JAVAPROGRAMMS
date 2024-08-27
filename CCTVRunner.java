class c
{
	public static void main(String[] args)
	{
		System.out.println("start main in CCTV");
		
		CCTV ref=new CCTV();
		System.out.println("default value:"+ref.price);
		
		CCTV ref1=new CCTV();
		System.out.println("updated value:"+ref1.prices);
		
		CCTV ref2=new CCTV();
		System.out.println("default brand:"+ref2.brand);
		
		CCTV ref3=new CCTV();
		System.out.println("updated brand:"+ref3.brands);
		
		
	
		
		
		System.out.println("end main in CCTV");
	}
	
}