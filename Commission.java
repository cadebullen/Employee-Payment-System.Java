// Commission.java
// Cade Bullen
//
public class Commission extends Hourly{
   private double sales;
   private double commissionRate;
   
   public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comissionRate){
      super (eName, eAddress, ePhone, socSecNumber, rate);
      sales = 0;
      this.commissionRate = comissionRate;
   }
   
   public void addSales (double totalSales){
      sales += totalSales;
   }
   
   public double pay(){
      double payment = super.pay() + (commissionRate * sales);
      sales = 0;
      return payment;
   }
   
   public String toString(){
      String result = super.toString();
      result += "\nThe total pay: " + this.pay();
      return result;
      
   }
}
   
   
       