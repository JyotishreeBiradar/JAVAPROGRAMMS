class MugRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in MugRunner");
		Mug mug=new Mug("Ceramic","White");
		Mug mug1=new Mug("Glass","Blue");
		
		System.out.println("Mug mug:"+mug.price);
		mug.capacity=350;
		System.out.println("Mug mug:"+mug.material);
		System.out.println("Mug mug1:"+mug1.material);
		System.out.println("Mug mug:"+mug.color);
		System.out.println("Mug mug1:"+mug1.color);
		System.out.println("Mug mug:"+mug.capacity);
		
		System.out.println("end main in MugRunner");
	}
}