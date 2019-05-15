
public class StockMarket {

private String name;
private String abb;
private String location;
private ArrayList<Company> companies;

 public StockMarket(String name, String abb, String location) {
  this.name = name;
  this.abb = abb;
  this.location = location;
 }
 public enum TType{BUY, SELL};

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getAbb() {
  return abb;
 }

 public void setAbb(String abb) {
  this.abb = abb;
 }

 public String getLocation() {
  return location;
 }

 public void setLocation(String location) {
  this.location = location;
 }

 public ArrayList<Company> getCompanies() {
  return companies;
 }

 public void setCompanies(ArrayList<Company> companies) {
  this.companies = companies;
 }

 public void addCompany(Company comp) {
 companies.add(comp);
}

public String toString() {
 return "NAme:" + name + " Abbriviation" + abb + " Location :" + location;
}

}