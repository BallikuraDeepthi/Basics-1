package basics;

public class Order {
	private int orderid;
	private String itemname;
	private int quantity;
	private boolean orderstatus;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(boolean orderstatus) {
		this.orderstatus = orderstatus;
	}

	void setquantity() {
		System.out.println("how much did you order");
		
	}
	void show() {
		System.out.println("orderid:"+orderid);
		System.out.println("item name:"+itemname);
		System.out.println("quantity:"+quantity);
		System.out.println("order status:"+orderstatus);
		System.out.println("");
		
		
		
	}
}

