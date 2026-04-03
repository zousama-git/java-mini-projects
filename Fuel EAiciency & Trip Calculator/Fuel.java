public class Fuel{
	public static void main(String[] args){
		
		Fuel calc = new Fuel();
		
		String carName = "Apex Cruiser";
		double newDistance = 120.00;
		double distance = 100.00;
		double fuel=20.00;
		double efficiency = calc.calculateKMPL(distance,fuel);
		double fuelNeeded = calc.fuelNeededForTrip(newDistance,efficiency);
	
		System.out.println("Car Model: "+ carName);
		System.out.println("Current EAiciency: "+ efficiency + " km/L");
		System.out.println("Fuel needed for next "+ newDistance + ": "+ fuelNeeded +"Liters");
		
	}

	public double calculateKMPL(double distance, double fuel){
		
		double kilometers=distance/fuel;
		return kilometers;
	}

	public double fuelNeededForTrip(double distance, double kilometers){
		double fuelNeeded = distance/kilometers;
		return fuelNeeded;
	}
}