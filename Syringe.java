class Syringe 
{
    String type="Insulin";
    double capacity;
    String brand;
    boolean disposable;

    public Syringe(double capacityLocal, String brandLocal)
    {
		capacity=capacityLocal;
		brand=brandLocal;
		
		System.out.println("created Syringe");
	}	
}