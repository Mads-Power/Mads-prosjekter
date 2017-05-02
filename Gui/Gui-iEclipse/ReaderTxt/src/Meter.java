
public class Meter {
  char regNr;
  boolean eqInOrder = false;
  char Pcode;
   int something;
   String name;
  
   public Meter(char regNr, boolean eqInOrder, char Pcode){
	   
   }
   
  public Meter(int something){
	  something = 10; 
	   
  }
  public char getRegNr(char regNr){
	  return regNr;
	  
  }
  
  public char setRegNr(char regNr){
	  this.regNr = regNr;
	  return regNr;
  }
  
  public boolean getEqInOrder(boolean eqInOrder){
	  return eqInOrder;
  }
  
  public void regNr() {
		//litt usikker men trengte den for å referere til Meter archive
		
	}
  
  public String getName(String name){
	  return name;
  }
  
  public String setName(String name){
	  this.name = name;
	  return name;
  }
  
  public boolean setEqInOrder(boolean eqInOrder){
	  this.eqInOrder = eqInOrder;
	  if(eqInOrder == false){
		  System.out.println( "this item is not in order: " + regNr);
	  }else{
		  System.out.println("this item is in order" + regNr);
	  }
	  
	  return eqInOrder;
  }
  
  public static void main(String[] args){
	  
	  
	 System.out.println("fuuuuaaark!!!" );
  }




	
}
