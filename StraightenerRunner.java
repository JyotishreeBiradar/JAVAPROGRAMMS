class StraightenerRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in StraightenerRunner");
		Straightener straightener=new Straightener("Philips",3000);
		Straightener straightener1=new Straightener("Syska",900);
		
		System.out.println("Straightener straightener:"+straightener.model);
		straightener.temperature=210;
		System.out.println("Straightener straightener:"+straightener.brand);
		System.out.println("Straightener straightener1:"+straightener1.brand);
		System.out.println("Straightener straightener:"+straightener.price);
		System.out.println("Straightener straightener1:"+straightener1.price);
		System.out.println("Straightener straightener:"+straightener.temperature);
		
		System.out.println("end main in StraightenerRunner");
	}
}