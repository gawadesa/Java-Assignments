package com.mastek.ecommerce.model;



public abstract class Product implements IProductService{
	

		protected int pid;
		protected String pName;
		protected static double price;
		private static int counter=0;
		


		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Product( String pName, double price) {
			super();
			this.pid = ++counter;
			this.pName = pName;
			Product.price =price;
		}
		public Product(int pid, String pName, double price) {
			super();
			this.pid = pid;
			this.pName = pName;
			Product.price = price;
		}
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPName() {
			return pName;
		}
		public void setPName(String pName) {
			this.pName = pName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			Product.price = price;
		}
		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pName=" + pName + ", price=" + price + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + pid;
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
			Product other = (Product) obj;
			if (pid != other.pid)
				return false;
			return true;
		}
		@Override
		public String add(double amount) throws Exception {
			Product.price=Product.price+amount;
			return amount+" credited in "+this.pid+". Current Price is: "+Product.price;
		}
		@Override
		public String remove(double amount) throws Exception {
			Product.price=Product.price-amount;
		return pid+" debited with "+amount+". Current Price:"+getPrice();
		}
		
	}
		
	

