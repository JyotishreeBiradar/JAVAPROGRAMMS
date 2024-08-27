class HelmetRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in HelmetRunner");
		
		Helmet helmet=new Helmet();
		System.out.println("default value:"+helmet.cost);
		
		Helmet helmet1=new Helmet();
		System.out.println("updated value:"+helmet1.costs);
		
		Helmet helmet2=new Helmet();
		System.out.println("default weight is in kg:"+helmet2.weight);
		
		
		Helmet helmet3=new Helmet();
		System.out.println("updated weight is in kg:"+helmet3.weights);
		
		
		Helmet helmet4=new Helmet();
		System.out.println("default colour:"+helmet4.colour);
		
		
		Helmet helmet5=new Helmet();
		System.out.println("default colour:"+helmet5.colours);
		
		
		
		System.out.println("end main in HelmetRunner");
	}
}