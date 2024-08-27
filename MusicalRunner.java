class MusicalRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in MusicalRunner");
		
		MusicalInstrument ref=new MusicalInstrument();
		MusicalInstrument ref1=new MusicalInstrument();
		MusicalInstrument ref2=new MusicalInstrument();
		MusicalInstrument ref3=new MusicalInstrument();
		MusicalInstrument ref4=new MusicalInstrument();
		MusicalInstrument ref5=new MusicalInstrument();
		MusicalInstrument ref6=new MusicalInstrument();
		
		System.out.println("referance MusicalInstrument:"+ref.name);
		System.out.println("referance MusicalInstrument:"+ref1.type);
		System.out.println("referance MusicalInstrument:"+ref2.price);
		System.out.println("referance MusicalInstrument:"+ref3.brand);
		
		ref.name="Violin";
		ref1.type="Working";
		ref2.price=10000;
		ref3.brand="Cecilio";
		ref4.price=20000;
		ref5.brand="Pearl";
		ref6.name="Drumset";
		System.out.println("referance MusicalInstrument:"+ref.name);
		System.out.println("referance MusicalInstrument:"+ref.type);
		System.out.println("referance MusicalInstrument:"+ref.price);
		System.out.println("referance MusicalInstrument:"+ref.brand);
		System.out.println("referance MusicalInstrument:"+ref.price);
		System.out.println("referance MusicalInstrument:"+ref.brand);
		System.out.println("referance MusicalInstrument:"+ref.name);
		
		System.out.println("end main in MusicalRunner");
	}
}