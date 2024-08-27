class WatchRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in WatchRunner");
		Watch watch=new Watch(1200, "stainlessSteel");
		Watch watch1=new Watch(2000, "metal");
		
		System.out.println("Watch watch:"+watch.brand);
		watch.shape="Round";
		System.out.println("Watch watch:"+watch.price);
		System.out.println("Watch watch1:"+watch1.price);
		System.out.println("Watch watch:"+watch.material);
		System.out.println("Watch watch1:"+watch1.material);
		System.out.println("Watch watch:"+watch.shape);
		System.out.println("end main in WatchRunner");
	}
}