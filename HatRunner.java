class HatRunner
{
	public static void main(String[] args)
	  {
		System.out.println("start main in HatRunner");
		
		Hat ref=new Hat();
		System.out.println("default value:"+ref.price);
		
		Hat ref1=new Hat();
		System.out.println("updated value:"+ref1.prices);
		
		Hat ref2=new Hat();
		System.out.println("default colour:"+ref2.colour);
		
		Hat ref3=new Hat();
		System.out.println("updated colour:"+ref3.colours);
		
		
		System.out.println("end main in HatRunner");
	}
}