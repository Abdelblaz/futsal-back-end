package be.bt.domain;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Places")
public class Place {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String city;
	private String locality;
	private String street;
	private int nStreet;
	private int postcode;
	private int hOpen;
	private  int hClose;
	
	private boolean shower;
	
	@OneToMany(mappedBy="place")
	private List<Hall> listHall = new ArrayList ();
	
	
	
	
public Place() {
	// TODO Auto-generated constructor stub
}




public Place(String name, String city, String locality, String street, int nStreet, int postcode,  int hOpen,
		 int hClose, boolean shower, List<Hall> listHall) {
	super();
	this.name = name;
	this.city = city;
	this.locality = locality;
	this.street = street;
	this.nStreet = nStreet;
	this.postcode = postcode;
	this.hOpen = hOpen;
	this.hClose = hClose;
	this.shower = shower;
	this.listHall = listHall;
}




public long getId() {
	return id;
}




public void setId(long id) {
	this.id = id;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getCity() {
	return city;
}




public void setCity(String city) {
	this.city = city;
}




public String getLocality() {
	return locality;
}




public void setLocality(String locality) {
	this.locality = locality;
}




public String getStreet() {
	return street;
}




public void setStreet(String street) {
	this.street = street;
}




public int getnStreet() {
	return nStreet;
}




public void setnStreet(int nStreet) {
	this.nStreet = nStreet;
}




public int getPostcode() {
	return postcode;
}




public void setPostcode(int postcode) {
	this.postcode = postcode;
}




public  int gethOpen() {
	return hOpen;
}




public void sethOpen( int hOpen) {
	this.hOpen = hOpen;
}




public  int gethClose() {
	return hClose;
}




public void sethClose( int hClose) {
	this.hClose = hClose;
}




public boolean isShower() {
	return shower;
}




public void setShower(boolean shower) {
	this.shower = shower;
}




public List<Hall> getListHall() {
	return listHall;
}




public void setListHall(List<Hall> listHall) {
	this.listHall = listHall;
}







}
