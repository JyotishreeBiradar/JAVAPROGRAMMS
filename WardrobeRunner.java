class WardrobeRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in wardrobe");
		
		Wardrobe wardrobe=new Wardrobe();
		System.out.println("default value:"+wardrobe.cost);
		
		Wardrobe wardrobe1=new Wardrobe();
		System.out.println("updated value:"+wardrobe1.costs);
		
		Wardrobe wardrobe2=new Wardrobe();
		System.out.println("default size:"+wardrobe2.size);
		
		Wardrobe wardrobe3=new Wardrobe();
		System.out.println("updated size:"+wardrobe3.sizes);
		
		Wardrobe wardrobe4=new Wardrobe();
		System.out.println("default colour:"+wardrobe4.colour);
		
		Wardrobe wardrobe5=new Wardrobe();
		System.out.println("updated colour:"+wardrobe5.colours);
		
		
		
		
		
		System.out.println("end main in wardrobe");
	}
	
}