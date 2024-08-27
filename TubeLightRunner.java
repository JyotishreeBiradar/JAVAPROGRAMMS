class TubeLightRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in TubeLightRunner");
		
		TubeLight ref=new TubeLight();
		TubeLight ref1=new TubeLight();
		TubeLight ref2=new TubeLight();
		TubeLight ref3=new TubeLight();
		TubeLight ref4=new TubeLight();
		TubeLight ref5=new TubeLight();
		TubeLight ref6=new TubeLight();
		
		System.out.println("referance TubeLight:"+ref.name);
		System.out.println("referance TubeLight:"+ref1.wattage);
		System.out.println("referance TubeLight:"+ref2.color);
		System.out.println("referance TubeLight:"+ref3.brand);
		
		ref.name="Fluorescentlamp";
		ref1.wattage=40;
		ref2.color="White";
		ref3.brand="Osram";
		ref4.name="Fluorescenttube";
		ref5.wattage=35;
		ref6.brand="Philips";
		System.out.println("referance TubeLight:"+ref.name);
		System.out.println("referance TubeLight:"+ref1.wattage);
		System.out.println("referance TubeLight:"+ref2.color);
		System.out.println("referance TubeLight:"+ref3.brand);
		System.out.println("referance TubeLight:"+ref4.name);
		System.out.println("referance TubeLight:"+ref5.wattage);
		System.out.println("referance TubeLight:"+ref6.brand);
		
		System.out.println("end main in TubeLightRunner");
	}
}