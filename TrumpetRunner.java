class TrumpetRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in TrumpetRunner");
		Trumpet trumpet=new Trumpet("Brass",1.2);
		Trumpet trumpet1=new Trumpet("Silver",1.3);
		
		System.out.println("Trumpet trumpet:"+trumpet.cost);
		trumpet.isGoldPlated=true;
		System.out.println("Trumpet trumpet:"+trumpet.material);
		System.out.println("Trumpet trumpet1:"+trumpet1.material);
		System.out.println("Trumpet trumpet:"+trumpet.length);
		System.out.println("Trumpet trumpet1:"+trumpet1.length);
		System.out.println("Trumpet trumpet:"+trumpet.isGoldPlated);
		
		System.out.println("end main in TrumpetRunner");
	}
}