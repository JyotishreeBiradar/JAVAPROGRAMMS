class PendulumRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in PendulumtRunner");
		Pendulum pendulum=new Pendulum("Brass",30.5);
		Pendulum pendulum1=new Pendulum("Steel",25);
		
		System.out.println("Pendulum pendulum:"+pendulum.type);
		pendulum.weight=1.5;
		System.out.println("Pendulum pendulum:"+pendulum.material);
		System.out.println("Pendulum pendulum1:"+pendulum1.material);
		System.out.println("Pendulum pendulum:"+pendulum.length);
		System.out.println("Pendulum pendulum1:"+pendulum1.length);
		System.out.println("Pendulum pendulum:"+pendulum.weight);
		
		System.out.println("end main in PendulumRunner");
	}
}