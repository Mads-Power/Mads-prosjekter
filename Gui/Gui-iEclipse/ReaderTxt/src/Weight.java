
public class Weight extends Meter {
  double minWeight, maxWeight;
  
  public Weight(double minWeight, double maxWeight, char regNr, boolean eqInOrder, char Pcode){
	  super(regNr, eqInOrder, Pcode);
	  
	  this.minWeight = minWeight;
	  this.maxWeight = maxWeight;
  }
  
  
  
  public double getMinWeight(){
	  return minWeight;
  }
  
  public double setMinWeight(){
	  return minWeight;
  }
  
  public double getMaxWeight(){
	  return maxWeight;
  }
  
  public double setMaxWeight(){
	  return maxWeight;
  }
  
  public String toString(){
	  return "Minimum vekt: " + minWeight + "Dette maximum vekt: " + maxWeight;
  }
  
}
