class HillRunner
{
	public static void main(String[] args)
	  {
		System.out.println("start main in HillRunner");
		
		HillStation ref=new HillStation();
		System.out.println("default place:"+ref.place);
		
		HillStation ref1=new HillStation();
		System.out.println("updated place:"+ref1.places);
		
		HillStation ref2=new HillStation();
		System.out.println("default distance is in km:"+ref2.distance);
		
		HillStation ref3=new HillStation();
		System.out.println("updated distance is in km:"+ref3.distances);
		
		
		System.out.println("end main in HillRunner");
	}
}


      