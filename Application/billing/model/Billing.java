package billing.model;

public class Billing {
	private int billId;
	private int noOfDays;
	private double pricePerSeat;
	private int totalSeatReserved;
	private double totalAmount;
	private String paymentType;
	public Billing(int billID,int nd,int ts,double price,String pay){
	billId=billID;
	noOfDays=nd;
	paymentType=pay;
	pricePerSeat=price;
	totalSeatReserved=ts;
	totalAmount=ts*nd*price;
	}
	public void setBillId(int billID){
	this.billId=billID;
	}

	 public void setNoOfDays(int nd){
	noOfDays=nd;
	}

	 public void setPaymentType(String pay){
	paymentType=pay;
	}
	public int getBillId(){
	return billId;
	}
	public int getNoOfDays(){
	return noOfDays;
	}
	public double getPricePerSeat(){
	return pricePerSeat;
	}
	public int getTotalSeatReserved() {
		return totalSeatReserved;
	}
	
	public double getTotalAmount(){
	return totalAmount;
	}
	
	public String getPaymentType(){
	return paymentType;
	}
	public String toString() {
		return "Billing [ BillID=" + billId + ", NumberOfDays=" + noOfDays + ", PricePerSeat=" + pricePerSeat + ",totalseatReserved="+totalSeatReserved+", TotalAmount=" + totalAmount +", PaymentType=" +paymentType + "]";
	}
	
	
}
