package edu.swe645.backend;

import java.util.ArrayList;
import java.util.Objects;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "surveys")
@XmlRootElement
public class Survey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 300)
	@Column(name = "id")
	private Long id;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 50)
	@Column(name = "fname")
	private String first_name;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 50)
	@Column(name = "lname")
	private String last_name;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 50)
	@Column(name = "address")
	private String address;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 50)
	@Column(name = "city")
	private String city;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 2)
	@Column(name = "state")
	private String state;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 5)
	@Column(name = "zip")
	private String zip;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 12)
	@Column(name = "telephone")
	private String phone_number;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 50)
	@Column(name = "email")
	private String email;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "date")
	private String date;
	
	@Size(max = 50)
	@Column(name = "qualities")
	private ArrayList<String> qualities;
	
	@Size(max = 20)
	@Column(name = "referral")
	private String interest;
	
	@Size(max = 20)
	@Column(name = "satisfaction")
	private String will_recommend;
	
	Survey() {}
	
	Survey(Long id, String first_name, String last_name, String address, String city, String state, String zip, String phone_number, String email, String survey_date, ArrayList<String> qualities, String interest, String will_recommend) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone_number = phone_number;
		this.email = email;
		this.date = survey_date;
		this.qualities = qualities;
		this.interest = interest;
		this.will_recommend = will_recommend;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getPhoneNumber() {
		return phone_number;
	}

	public void setPhoneNumber(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<String> getQualities() {
		return qualities;
	}

	public void setQualities(ArrayList<String> qualities) {
		this.qualities = qualities;
	}
	
	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getWillRecommend() {
		return will_recommend;
	}

	public void setWillRecommend(String will_recommend) {
		this.will_recommend = will_recommend;
	}
	
	@Override
	public boolean equals(Object survey) {
		if (this == survey)
			return true;
		if (!(survey instanceof Survey))
			return false;
		Survey o = (Survey) survey;
		return  (Objects.equals(this.id, o.id) &&
				Objects.equals(this.first_name, o.first_name) &&
				Objects.equals(this.last_name, o.last_name) && 
				Objects.equals(this.address, o.address) && 
				Objects.equals(this.city, o.city) && 
				Objects.equals(this.state, o.state) && 
				Objects.equals(this.zip, o.zip) && 
				Objects.equals(this.phone_number, o.phone_number) && 
				Objects.equals(this.email, o.email) && 
				Objects.equals(this.date, o.date) && 
				Objects.equals(this.qualities, o.qualities) && 
				Objects.equals(this.interest, o.interest) && 
				Objects.equals(this.will_recommend, o.will_recommend));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.first_name, this.last_name, this.address,	this.city, this.state, this.zip, this.phone_number,
							this.email, this.date, this.interest, this.will_recommend);
	}
	
	@Override
	public String toString() {
		return "entities.Survey[ surveyId=" + id + " ]";
	}
}
