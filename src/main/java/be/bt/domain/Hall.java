package be.bt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Halls")
public class Hall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int floor;
	private int number;
	private double lengthField;
	private double widthField;
	
	
	@JsonIgnore
	@ManyToOne
	private Place place;
	
	
	public Hall() {

		// TODO Auto-generated constructor stub
	}
	
	


	public Hall(  int number,int floor, double lengthField, double widthField, Place place) {
		
		this.number= number;
		this.floor = floor;
		this.lengthField = lengthField;
		this.widthField = widthField;
		this.place = place;
	}
	


	public long getId() {
		return id;
	}

	

	public void setId(long id) {
		this.id = id;
	}


	public int getFloor() {
		return floor;
	}


	public void setFloor(int floor) {
		this.floor = floor;
	}




	public int getNumber() {
		return number;
	}




	public void setNumber(int number) {
		this.number = number;
	}




	public double getLengthField() {
		return lengthField;
	}




	public void setLengthField(double lengthField) {
		this.lengthField = lengthField;
	}




	public double getWidthField() {
		return widthField;
	}




	public void setWidthField(double widthField) {
		this.widthField = widthField;
	}




	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}


	
	  
	
	
}
