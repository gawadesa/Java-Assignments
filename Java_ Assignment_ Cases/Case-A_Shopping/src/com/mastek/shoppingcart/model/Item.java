package com.mastek.shoppingcart.model;

public class Item {

	
	protected String ItemName;
	protected int Quantity;
	protected double ItemPrice;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String itemName, int quantity, double itemPrice) {
		super();
		ItemName = itemName;
		Quantity = quantity;
		ItemPrice = itemPrice;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "Item [ItemName=" + ItemName + ", Quantity=" + Quantity + ", ItemPrice=" + ItemPrice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ItemName == null) ? 0 : ItemName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ItemPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (ItemName == null) {
			if (other.ItemName != null)
				return false;
		} else if (!ItemName.equals(other.ItemName))
			return false;
		if (Double.doubleToLongBits(ItemPrice) != Double.doubleToLongBits(other.ItemPrice))
			return false;
		return true;
	}
	
	
}
