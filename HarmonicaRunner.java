class HarmonicaRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in HarmonicaRunner");
		Harmonica harmonica=new Harmonica("Hohner",10);
		Harmonica harmonica1=new Harmonica("Suzuki",12);
		
		System.out.println("Harmonica harmonica:"+harmonica.type);
		harmonica.price=800;
		System.out.println("Harmonica harmonica:"+harmonica.brand);
		System.out.println("Harmonica harmonica1:"+harmonica1.brand);
		System.out.println("Harmonica harmonica:"+harmonica.holes);
		System.out.println("Harmonica harmonica1:"+harmonica1.holes);
		System.out.println("Harmonica harmonica:"+harmonica.price);
		
		System.out.println("end main in HarmonicaRunner");
	}
}