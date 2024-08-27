class Pendulum 
{
    String type="Wall clock";
    String material;
	double length;
    double weight;

    public Pendulum(String materialLocal, double lengthLocal)
	{
		material=materialLocal;
		length=lengthLocal;
		
		System.out.println("created Pendulum");
	}
}