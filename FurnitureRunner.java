class FurnitureRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in Furniture");
		
		Furniture furniture=new Furniture();
		System.out.println("default value:"+furniture.cost);
		
		Furniture furniture1=new Furniture();
		System.out.println("updated value:"+furniture1.costs);
		
		Furniture furniture2=new Furniture();
		System.out.println("default weight is in kg:"+furniture2.weight);
		
		
		Furniture furniture3=new Furniture();
		System.out.println("updated weight is in kg:"+furniture3.weights);
		
		
		Furniture furniture4=new Furniture();
		System.out.println("default name:"+furniture4.name);
		
		
		Furniture furniture5=new Furniture();
		System.out.println("updated name:"+furniture5.names);
		
		
		
		
		System.out.println("end main in Furniture");
	}
	
}