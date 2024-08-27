class InjectionRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in InjectionRunner");
		
		Injection ref=new Injection();
		Injection ref1=new Injection();
		Injection ref2=new Injection();
		Injection ref3=new Injection();
		Injection ref4=new Injection();
		Injection ref5=new Injection();
		Injection ref6=new Injection();
		
		System.out.println("referance Injection:"+ref.medicineName);
		System.out.println("referance Injection:"+ref1.dosage);
		System.out.println("referance Injection:"+ref2.patientName);
		System.out.println("referance Injection:"+ref3.date);
		
		ref.medicineName="Paracetamol";
		ref1.dosage=500;
		ref2.patientName="XYZ";
		ref3.date="july,2025";
		ref4.medicineName="Omez";
		ref5.dosage=20;
		ref6.date="dec,2024";
		System.out.println("referance Injection:"+ref.medicineName);
		System.out.println("referance Injection:"+ref1.dosage);
		System.out.println("referance Injection:"+ref2.patientName);
		System.out.println("referance Injection:"+ref3.date);
		System.out.println("referance Injection:"+ref4.medicineName);
		System.out.println("referance Injection:"+ref5.dosage);
		System.out.println("referance Injection:"+ref6.date);
		
		System.out.println("end main in InjectionRunner");
	}
}