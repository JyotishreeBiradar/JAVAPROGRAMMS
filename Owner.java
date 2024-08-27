class Owner
{
  String name;
  double age;
  String gender;
  
  Owner(  String name,double age,String gender)
  {
  this.name=name;
  this.age=age;
  this.gender=gender;
  }
  
  public void details()
  {
	  System.out.println("Name:"+  this.name);
	  System.out.println("Age:"+  this.age);
	  System.out.println("Gender:"+  this.gender);
	  
  }
}