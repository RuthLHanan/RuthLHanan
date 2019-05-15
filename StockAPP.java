public class StockAPP {

 public static void main(String[] args) {
  System.out.println("Creating Stock Market");

  StockMarket st = new StockMarket("Ruth MH Exchange","RMHE","Mountain House");

  System.out.println("CReated stock market" + st.toString());
 }

}