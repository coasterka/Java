public class Product {
	
	private String productName;
	private double productPrice;
	
	public Product(String productName, double productPrice){
		setProductName(productName);
		setProductPrice(productPrice);
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	
}
