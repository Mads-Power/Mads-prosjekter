import java.util.ArrayList;
import java.util.Scanner;

public class MeterArchive {
	
 ArrayList<Meter> ToolsOfMeasurments = new ArrayList<Meter>(); 
 private Meter meter;
 
 char addI, changeI, fetchI;
 boolean delI;
 
 
 
 public MeterArchive(Meter meter ){
	 this.meter = meter;
	 
 }
 public void getAddI(){
	 meter.regNr();
 }
 
 public void delI(boolean delI){
	 Scanner input = new Scanner(System.in);
	 
	 try {
		 
		 
		 System.out.println("Delete by typing del + regNr" );
		 String del = input.nextLine();
		 
		 
	 }
	 
	 meter.regNr();
	 
	 
	 
 }
 
 public void fetchI(char fetchI){
	 this.fetchI = fetchI;
	 if(fetchI == 0){
		 System.out.println("vi kunne ikke finne instrumentet: " + null);
	 }else{
		 System.out.println("Her er instrumentet ditt: " + fetchI);
	 }
	
 }
}
