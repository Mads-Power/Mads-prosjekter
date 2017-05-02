
public class Clock extends Meter {
 double minTimeI;
 
 public Clock(double minTimeI, char regNr, boolean eqInOrder, char Pcode){
	 super(regNr, eqInOrder, Pcode);
	 
	 }
 
 public double getMinTimeI(){
	 return minTimeI;
 }
 
 public double setMinTimeI(){
	 return minTimeI;
 }
 
 public String toString(){
	 return "Minimum Tids Interval: " + minTimeI;
 }
 
}
