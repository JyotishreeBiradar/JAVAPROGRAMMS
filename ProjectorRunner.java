class ProjectorRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start running in main");
		
		Projector projector=new Projector("Skyblue");    //referance
		projector.type="LED";
		projector.weight=40;          //referance
		System.out.println("Company:"+projector.company);
		System.out.println("Color:"+projector.color);
		System.out.println("Type:"+projector.type);
		System.out.println("Weight:"+projector.weight);
		
		Projector projector1=new Projector("Green");    //referance
		projector1.type="LCD";
		projector.weight=45;            //referance
		System.out.println("Company:"+projector1.company);
		System.out.println("Color:"+projector1.color);
		System.out.println("Type:"+projector1.type);
		System.out.println("Weight:"+projector1.weight);
		
		Projector projector2=new Projector("Grey");    //referance
		projector2.type="DLP";
		projector.weight=50;           //referance
		System.out.println("Company:"+projector2.company);
		System.out.println("Color:"+projector2.color);
		System.out.println("Type:"+projector2.type);
		System.out.println("Weight:"+projector2.weight);
		System.out.println("end running in main");
		
		
	}
}