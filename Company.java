public class Company {

private String name;
private String location;
private Stock stock;
private double shares;
private ArrayList<Customer> cust;

public String getName() {
 return name;
}
public void setName(String companyName) {
 name = companyName;
}
public String getLocation() {
 return location;
}
public void setLocation(String loc) {
 location = loc;
}
public Stock getStock() { 
 return stock;
}
public void setStock(Stock s) {
 stock = s;
}
public Double getShares() {
 return shares;
}
public void setShares(Double share) {
 shares = share;
}
public ArrayList<Customer> getCustomer() {
 return customer;
}
public void addCustomer(Customer custom) {
 cust.add(custom);
}


}