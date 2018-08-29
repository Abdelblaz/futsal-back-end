package be.bt.domain;

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
	private short id;
	private String name;
	private String city;
	private String locality;
	private String street;
	private short nStreet;
	private short postcode;
	private boolean open;
	private boolean shower;
	
	@OneToMany(mappedBy="place")
	private List<Hall> listHall = new ArrayList ();
	
	
	
	
public Place() {
	// TODO Auto-generated constructor stub
}




public Place( String name, String city, String locality, String street, short nStreet, short postcode,
		boolean open, boolean shower, List<Hall> listHall) {
	super();
	
	this.name = name;
	this.city = city;
	this.locality = locality;
	this.street = street;
	this.nStreet = nStreet;
	this.postcode = postcode;
	this.open = open;
	this.shower = shower;
	this.listHall = listHall;
}




public short getId() {
	return id;
}




public void setId(short id) {
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




public short getnStreet() {
	return nStreet;
}




public void setnStreet(short nStreet) {
	this.nStreet = nStreet;
}




public short getPostcode() {
	return postcode;
}




public void setPostcode(short postcode) {
	this.postcode = postcode;
}




public boolean isOpen() {
	return open;
}




public void setOpen(boolean open) {
	this.open = open;
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

@Override
public String toString() {
	return " fonctionne";
}




}
