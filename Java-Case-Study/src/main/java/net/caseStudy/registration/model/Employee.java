package net.caseStudy.registration.model;

public class Employee {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String birthday;
	private String position;
	private String compensationType;
	private String compensationAmount;
	private String compensationDescription;
	private String compensationDate;
	
	public String getCompensationType() {
		return compensationType;
	}
	public void setCompensationType(String compensationType) {
		this.compensationType = compensationType;
	}
	public String getCompensationAmount() {
		return compensationAmount;
	}
	public void setCompensationAmount(String compensationAmount) {
		this.compensationAmount = compensationAmount;
	}
	public String getCompensationDescription() {
		return compensationDescription;
	}
	public void setCompensationDescription(String compensationDescription) {
		this.compensationDescription = compensationDescription;
	}
	public String getCompensationDate() {
		return compensationDate;
	}
	public void setCompensationDate(String compensationDate) {
		this.compensationDate = compensationDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
