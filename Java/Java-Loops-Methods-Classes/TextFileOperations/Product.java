public class Product{
	private String productName;
	private String productPrice;
	
	//generating product name and product price getters and setters
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		if (productName == null) {
			throw new IllegalArgumentException("Illegal argument exception.");			
		}
		this.productName = productName;
	}
	
	public String getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(String string) {
		this.productPrice = string;
	}	
}
