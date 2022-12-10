package java8;
//Create a class named "Product" with fields like prodId, prodName, category and price.
// Create List of products and display total of all those products that comes under "electronics" category
public class Product {
    private int proId;
    private String prodName;

    private String category;

    private int price;

    public Product(int proId, String prodName, String category, int price) {
        this.proId = proId;
        this.prodName = prodName;
        this.category = category;
        this.price = price;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
