class MaskRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in MaskRunner");
		Mask mask=new Mask("Face mask",30);
		Mask mask1=new Mask("Medline",900);
		
		System.out.println("Mask mask:"+mask.type);
		mask.reusable=false;
		System.out.println("Mask mask:"+mask.brand);
		System.out.println("Mask mask1:"+mask1.brand);
		System.out.println("Mask mask:"+mask.price);
		System.out.println("Mask mask1:"+mask1.price);
		System.out.println("Mask mask:"+mask.reusable);
		
		System.out.println("end main in MaskRunner");
	}
}