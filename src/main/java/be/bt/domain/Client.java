package be.bt.domain;

public class Client extends Person {
	

	private String locality;
	private Note note;
	private Reservation reservation;
	

	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String locality) {
		super();
		this.locality = locality;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	
	
	
	
} 
