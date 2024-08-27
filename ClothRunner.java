class ClothRunner
{
	public static void main(String[] args)
	  {
		System.out.println("start main in ClothRunner");
		
		Cloth ref=new Cloth();
		System.out.println("default value:"+ref.price);
		
		Cloth ref1=new Cloth();
		System.out.println("updated:"+ref1.size);
		
		Cloth ref2=new Cloth();
		System.out.println(ref2.brand);
		
		
	   System.out.println("end main in ClothRunner");
	}
}