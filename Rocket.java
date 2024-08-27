class Rocket
{
  String country="India";
  double speed;
  double fuelCapacity;
  double noOfThrusters;
  
  Rocket(double speed)
  {
	  System.out.println("created speed");
	  this.speed=speed;
  }
  
  public void SetfuelCapacity(double fuelCapacity)
  {
	 System.out.println("created fuelCapacity");
     this.fuelCapacity=fuelCapacity;	 
  }
  
}