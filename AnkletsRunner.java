class AnkletsRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in AnkletsRunner");
		Anklets anklets=new Anklets("Gold","Simple");
		Anklets anklets1=new Anklets("Silver","Patterned");
		
		System.out.println("Anklets anklets:"+anklets.price);
		System.out.println("Anklets anklets1:"+anklets1.price);
		anklets.length=23;
		anklets1.length=25;
		System.out.println("Anklets anklets:"+anklets.material);
		System.out.println("Anklets anklets1:"+anklets1.material);
		System.out.println("Anklets anklets:"+anklets.design);
		System.out.println("Anklets anklets1:"+anklets1.design);
		System.out.println("Anklets anklets:"+anklets.length);
		System.out.println("Anklets anklets1:"+anklets1.length);
		
		System.out.println("end main in AnkletsRunner");
	}
}