class Projector
{
	String company="Video projector";
	String type;
	String color;
	double 	weight;
	
	Projector(String color)
	{
		System.out.println("created color");
		this.color=color;
	}
	
	public void Settype(String type)
	{
		System.out.println("created type");
		this.type=type;
	}
}