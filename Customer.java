public class Customer {

private int id;
private String cname;
private Broker broker;
private double cbalance;
private HashMap<String,int> shares;

public Int getId() {
 return id;
}
public void setId(Int i) {
 id = i;
}
public String getCName() {
 return cname;
}
public void setCName(String cn) {
 cname = cn;
}
public Broker getBroker() {
 return broker;
}
public void setBroker(Broker broke) {
 broker = broke;
}
public Double getCBalance() {
 return cbalance;
}
public void setCBalance(Double cb) {
 cbalance = cb;
}
public addShares(String ticker, int numShares); {
 shares.add(ticker,numSahres);
}

public int getShares(String ticker) {
  return shares.get(ticker);
}


}