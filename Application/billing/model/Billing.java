package billing.model;

public class Billing {
	private String billId;
	private int noOfDays;
	private double pricePerSeat;
	private double totalAmount;
	private String paymentType;
	public Billing(String billNo,int nd,double price,String pay){
	billId=billNo;
	noOfDays=nd;
	paymentType=pay;
	pricePerSeat=price;
	totalAmount=nd*price;
	}
	public void setBillId(String billNo){
	billId=billNo;
	}

	 public void setNoOfDays(int nd){
	noOfDays=nd;
	}

	 public void setPaymentType(String pay){
	paymentType=pay;
	}
	public String getBillId(){
	return billId;
	}
	public int getNoOfDays(){
	return noOfDays;
	}
	public double getPricePerSeat(){
	return pricePerSeat;
	}
	public double getTotalAmount(){
	return totalAmount;
	}
	public String getPaymentType(){
	return paymentType;
	}
	public String toString() {
		return "Billing [ BillID=" + billId + ", NumberOfDays=" + noOfDays + ", PricePerSeat=" + pricePerSeat + ", TotalAmount=" + totalAmount +", PaymentType=" +paymentType + "]";
	}
	
	
}
