public class Broker {

private int lnum;
private String name;
private double com;
private ArrayList<Transaction> trans;
private ArrayList<Customer> cust;

public int getLNum() {
 return lnum;
}
public void setLNum(int ln) {
 lnum = ln;
}
public String getName() {
 return name;
}
public void setName(String brokerName) {
 name = brokerName;
}
public double getCom() {
 return com;
}
public void setCom(Double commision) {
 com = commission; 
}
public void addTransacton(Transaction transac) {
 trans.add(transac);
}
public void addCustomer(Customer custom) {
 cust.add(custom);
}


}