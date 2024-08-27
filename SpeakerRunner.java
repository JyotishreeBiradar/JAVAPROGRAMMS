class SpeakerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start running in main");
		
		Speaker speaker=new Speaker("Small");    //referance
		speaker.SetCost(12333);
		speaker.output="song playing";          //referance
		System.out.println("Brand:"+speaker.brand);
		System.out.println("Size:"+speaker.size);
		System.out.println("Cost:"+speaker.cost);
		System.out.println("Output:"+speaker.output);
		
		Speaker speaker1=new Speaker("Medium");    //referance
		speaker1.SetCost(3214);
		speaker.output="song is not playing";            //referance
		System.out.println("Brand:"+speaker1.brand);
		System.out.println("Size:"+speaker1.size);
		System.out.println("Cost:"+speaker1.cost);
		System.out.println("Output:"+speaker1.output);
		
		Speaker speaker2=new Speaker("Large");    //referance
		speaker2.SetCost(4231);
		speaker.output="song is not audible" ;           //referance
		System.out.println("Brand:"+speaker2.brand);
		System.out.println("Size:"+speaker2.size);
		System.out.println("Cost:"+speaker2.cost);
		System.out.println("Output:"+speaker2.output);
		
		
		
	}
}