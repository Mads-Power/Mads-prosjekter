
public class Thermometer extends Meter{
	double minTemp, maxTemp;
	
	public Thermometer(double minTemp, double maxTemp, char regNr, boolean eqInOrder, char Pcode) {
		super(regNr, eqInOrder, Pcode);
		
		}
	
	public double getMinTemp(){
		return minTemp;
	}
	
	public double setMinTemp(){
		return minTemp;
	}
	
	public double getMaxTemp(){
		return maxTemp;
	}
	
	public double setMaxTemp(){
		
		return maxTemp;
	}
	
	public String toString(){
		return  "Dette er min temp: " + minTemp + "Dette er Max temp: " + maxTemp; 
	}
}
	
	
