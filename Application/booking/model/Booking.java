package booking.model;

public class Booking {
	   private int bookingID;
	   private String firstName;
	   private String lastName;
	   private String mobileNo;
	   private String Address;
	   private String Gender;
	   private String BookingDate;
	   private String Destination;
	   private String numberOfDays;
	   private String numberOfSeatBooking;
	   private String BusType;
	   private String paymentType;
	   
	   
	   public Booking(int bookID,String fn,String ls,String mn,String ad,String g,String bd,String pv,String noDays,String seatBook,String bt,String pt) {
		   bookingID=bookID;
		   firstName=fn;
		   lastName=ls;
		   mobileNo=mn;
		   Address=ad;
		   Gender=g;
		   BookingDate=bd;
	       Destination=pv;
		   numberOfDays=noDays;
		   numberOfSeatBooking=seatBook;
		   BusType=bt;
		   paymentType=pt;
		   
	   }
	   public void setBookingID(int BookingID) {
		   this.bookingID=BookingID;
	   }
	   public int getBookingID() {
		   return bookingID;
	   }
	   public void setFirstName(String fn) {
		   firstName=fn;
	   }
	   public String getFirstName() {
		   return firstName;
	   }
	   public String getlastName() {
		   return lastName;
	   }
	   public void setLirstName(String ls) {
		   lastName=ls;
	   }
	   public String getMobileNo() {
		   return mobileNo;
	   }
	   public void setMobileNo(String mn) {
		   mobileNo=mn;
	   }
	   public String getAddress() {
		   return Address;
	   }
	   public String getGender() {
		   return Gender;
	   }
	   public String getBookingDate() {
		   return BookingDate;
	   }
	   public String getDestination() {
		   return Destination;
	   }
	   public String getNumberOfDays() {
		   return numberOfDays;
	   }
	   
	   public String getNumberOfSeatBoking() {
		   return numberOfSeatBooking;
	   }
	   public String getBusType() {
		   return BusType;
	   }
	   public String getPaymentType() {
		   return paymentType;
	   }
	   
	   public String toString() {
		   return "Booking [fName=" + firstName + ", lname=" + lastName + ",MobileNo="+mobileNo+", address=" + Address + ",Gender="+Gender+",BookingDate="+BookingDate+", Destination=" + Destination + ", numberOfDays=" + numberOfDays +", SeatBooking=" +numberOfSeatBooking + ", BusType=" + BusType + ", PaymentType=" + paymentType + "]";
	   }

}

