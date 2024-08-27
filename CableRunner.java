class CableRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in CableRunner");
		Cable cable=new Cable( 200, "copper");
		Cable cable1=new Cable( 300, "Aluminium");
		
		System.out.println("Cable cable:"+cable.brand);
		cable.color="Blue";
		System.out.println("Cable cable:"+cable.price);
		System.out.println("Cable cable1:"+cable1.price);
		System.out.println("Cable cable:"+cable.material);
		System.out.println("Cable cable1:"+cable1.material);
		System.out.println("Cable cable:"+cable.color);
		System.out.println("end main in CableRunner");
	}
}