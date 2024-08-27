class RocketRunner
{
  public static void main(String[] args)
	{
		System.out.println("Start running in main");
		
		Rocket rocket=new Rocket(3);    //referance
		rocket.fuelCapacity=20000;
		rocket.noOfThrusters=8;          //referance
		System.out.println("Country:"+rocket.country);
		System.out.println("Speed:"+rocket.speed);
		System.out.println("FuelCapacity:"+rocket.fuelCapacity);
		System.out.println("NoOfThrusters:"+rocket.noOfThrusters);
		
		Rocket rocket1=new Rocket(5);    //referance
		rocket1.fuelCapacity=10000;
		rocket.noOfThrusters=5;            //referance
		System.out.println("Country:"+rocket1.country);
		System.out.println("Speed:"+rocket1.speed);
		System.out.println("FuelCapacity:"+rocket1.fuelCapacity);
		System.out.println("NoOfThrusters:"+rocket1.noOfThrusters);
		
		Rocket rocket2=new Rocket(7);    //referance
		rocket.fuelCapacity=5000;
		rocket.noOfThrusters=3 ;           //referance
		System.out.println("Country:"+rocket2.country);
		System.out.println("Speed:"+rocket2.speed);
		System.out.println("FuelCapacity:"+rocket2.fuelCapacity);
		System.out.println("NoOfThrusters:"+rocket2.noOfThrusters);
		System.out.println("end running in main");
		
		
	}
}