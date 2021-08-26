package passenger.model;

public class Passenger {
	private int passengerID;
	private String name;
	private int contact;
	private String passengerType;
	
	public Passenger(int id,String nam,int cont,String type){
	passengerID=id;
	name=nam;
	contact=cont;
	passengerType=type;
	}
	public int getPassengerID(){
	return passengerID;
	}
	public String getName(){
	return name;
	}
	public int getContact(){
	return contact;
	}
	
	public String getPassengerType(){
	return passengerType;
	}
	public void setPassengerID(int id){
	passengerID=id;
	}
	public void setName(String nam){
	name=nam;
	}
	public void setContact(int cont){
	contact=cont;
	}
	public void setPassengerType(String type){
	passengerType=type;
	}
	public String toString() {
		return "Passenger [id=" + passengerID + ", name=" + name + ", contact=" + contact + ", passengerType=" + passengerType + "]";
	}
	
}
