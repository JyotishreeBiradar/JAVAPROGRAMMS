class ChocolateRunner
{
   public static void main(String[] args)
	{
		System.out.println("Start running in main");
		
		Chocolate chocolate=new Chocolate(100);    //referance
		chocolate.flavour="chocolate";
		chocolate.size="small";          //referance
		System.out.println("Brand:"+chocolate.brand);
		System.out.println("Price:"+chocolate.price);
		System.out.println("Flavour:"+chocolate.flavour);
		System.out.println("Size:"+chocolate.size);
		
		Chocolate chocolate1=new Chocolate(200);    //referance
		chocolate1.flavour="strawberry";
		chocolate.size="medium";            //referance
		System.out.println("Brand:"+chocolate1.brand);
		System.out.println("Price:"+chocolate1.price);
		System.out.println("Flavour:"+chocolate1.flavour);
		System.out.println("Size:"+chocolate1.size);
		
		Chocolate chocolate2=new Chocolate(300);    //referance
		chocolate2.flavour="venilla";
		chocolate.size="large" ;           //referance
		System.out.println("Brand:"+chocolate2.brand);
		System.out.println("Price:"+chocolate2.price);
		System.out.println("Flavour:"+chocolate2.flavour);
		System.out.println("Size:"+chocolate2.size);
		System.out.println("end running in main");
		
		
	}
}
