package be.bt.domain;

public class Person {
	
	private int id;
	private String name;
	private String firstname;
	private int telNumber;
	private String email;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, String firstname, String address, int telNumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.telNumber = telNumber;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public int getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(int telNumber) {
		this.telNumber = telNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
