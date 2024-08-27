class KettletRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in KettleRunner");
		
		Kettle ref=new Kettle();
		Kettle ref1=new Kettle();
		Kettle ref2=new Kettle();
		Kettle ref3=new Kettle();
		Kettle ref4=new Kettle();
		Kettle ref5=new Kettle();
		Kettle ref6=new Kettle();
		
		System.out.println("referance Kettle:"+ref.brand);
		System.out.println("referance Kettle:"+ref1.capacity);
		System.out.println("referance Kettle:"+ref2.material);
		System.out.println("referance Kettle:"+ref3.price);
		
		ref.brand="Prestige";
		ref1.capacity=1.5;
		ref2.material="Stainless steel";
		ref3.price=699;
		ref4.brand="Milton";
		ref5.material="Aluminium";
		ref6.price=800;
		System.out.println("referance Kettle:"+ref.brand);
		System.out.println("referance Kettle:"+ref1.capacity);
		System.out.println("referance Kettle:"+ref2.material);
		System.out.println("referance Kettle:"+ref3.price);
		System.out.println("referance Kettle:"+ref4.brand);
		System.out.println("referance Kettle:"+ref5.material);
		System.out.println("referance Kettle:"+ref6.price);
		
		System.out.println("end main in TubeLightRunner");
	}
}