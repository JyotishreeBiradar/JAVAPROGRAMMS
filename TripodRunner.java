class TripodRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in Tripod");
		
		Tripod tripod=new Tripod();
		System.out.println("default value:"+tripod.price);
		
		Tripod tripod1=new Tripod();
		System.out.println("updated value:"+tripod1.prices);
		
		Tripod tripod2=new Tripod();
		System.out.println("default size is in cm:"+tripod2.size);
		
		Tripod tripod3=new Tripod();
		System.out.println("updated size is in cm:"+tripod3.sizes);
		
		Tripod tripod4=new Tripod();
		System.out.println("default shape:"+tripod4.shape);
		
		Tripod tripod5=new Tripod();
		System.out.println("updated shape:"+tripod5.shapes);
		
		
		System.out.println("end main in Tripod");
	}
	
}