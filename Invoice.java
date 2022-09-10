class Invoice{
	String partnumber;
	String partdescription;
	int quantity;
	double priceperitem;
	Invoice(){
		partnumber="";
		partdescription="";
		quantity=0;
		priceperitem=0.0;
	}
	void setpartnumber(String partnumber) {
		this.partnumber=partnumber;
	}
	String getpartnumber() {
		return partnumber;
	}
	void setpartdescription(String partdescription) {
		this.partdescription=partdescription;
	}
	String getpartdescription() {
		return partdescription;
	}
	void setquantity(int quantity) {
		if (quantity<0)
			quantity=0;
		else
		    this.quantity=quantity;
	}
	int getquantity() {
		return quantity;
	}
	void setpriceperitem(double priceperitem) {
		if (priceperitem<0)
			priceperitem=0.0;
		else
		    this.priceperitem=priceperitem;
	}
	double getpriceperitem() {
		return priceperitem;
	}
	double getInvoiceAmount() {
		double amount=quantity*priceperitem;
		return amount;
	}
}