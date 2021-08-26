package booking.model;

public class Booking {
	 private String firstName;
	   private String lastName;
	   private String Address;
	   private String Destination;
	   private int numberOfDays;
	   private String Bus;
	   private int numberOfSeatBooking;
	   private String BusType;
	   private String paymentType;
	   
	   
	   public Booking(String fn,String ls,String ad,String pv,int nd,String b,int sb,String bt,String pt) {
		   firstName=fn;
		   lastName=ls;
		   Address=ad;
	       Destination=pv;
		   numberOfDays=nd;
		   Bus=b;
		   numberOfSeatBooking=sb;
		   BusType=bt;
		   paymentType=pt;
		   
	   }
	   public String getFirstName() {
		   return firstName;
	   }
	   public String getlastName() {
		   return lastName;
	   }
	   public String getAddress() {
		   return Address;
	   }
	   public String getDestination() {
		   return Destination;
	   }
	   public int getNumberOfDays() {
		   return numberOfDays;
	   }
	   public String getBus() {
		   return Bus;
	   }
	   public int getNumberOfSeatBoking() {
		   return numberOfSeatBooking;
	   }
	   public String getBusType() {
		   return BusType;
	   }
	   public String getPaymentType() {
		   return paymentType;
	   }
	   
	   public String toString() {
		   return "Booking [fName=" + firstName + ", lname=" + lastName + ", address=" + Address + ", Destination=" + Destination + ", numberOfDays=" + numberOfDays +", Bus=" + Bus + ", SeatBooking=" +numberOfSeatBooking + ", BusType=" + BusType + ", PaymentType=" + paymentType + "]";
	   }

}

