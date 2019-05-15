public class Transaction {

public enum TType{BUY, SELL};
private TType type;
private int id;
private Stock stock;
private double price;
private Broker broker;
private Customer customer;

public int getId() {
 return id;
}
public void setId(int i) {
 id = i;
}
public boolean getType() {
 return type;
}
public void setType(boolean t) {
 type = t;
}
public Stock getStock() {
 return stock;
}
public void setStock(Stock s) {
 stock = s;
} 
public double getPrice() {
 return price;
}
public void setPrice(double p) {
 price = p;
}
public Broker getBroker() {
 return broker;
}
public void setBroker(Broker b) {
 broker = b;
} 
public Customer getCustomer() {
 return customer;
}
public void setCustomer(Customer c) {
 customer = c;
}
public TType getTType() {
 return ttype;
}
public void setTType(TType type) {
 ttype = type;
}

}