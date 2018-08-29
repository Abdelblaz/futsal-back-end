package be.bt.domain;

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
	private String type;
	private short floor;
	private double length;
	private double width;
	
	
	@JsonIgnore
	@ManyToOne
	private Place place;
	
	
	public Hall() {

		// TODO Auto-generated constructor stub
	}
	
	


	public Hall( String type, short floor, double length, double width, Place place) {
		super();
		
		this.type = type;
		this.floor = floor;
		this.length = length;
		this.width = width;
		this.place = place;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public short getFloor() {
		return floor;
	}


	public void setFloor(short floor) {
		this.floor = floor;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public Place getPlace() {
		return place;
	}


	public void setPlace(Place place) {
		this.place = place;
	}


	
	  
	
	
}
