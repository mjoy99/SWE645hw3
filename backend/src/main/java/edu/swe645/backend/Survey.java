package edu.swe645.backend;

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
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(max = 20)
	@Column(name = "fname")
	private String fname;
	
	@NotNull
	@Size(max = 20)
	@Column(name = "lname")
	private String lname;
	
	@NotNull
	@Size(max = 30)
	@Column(name = "address")
	private String address;
	
	@NotNull
	@Size(max = 20)
	@Column(name = "city")
	private String city;
	
	@NotNull
	@Size(max = 2)
	@Column(name = "state")
	private String state;
	
	@NotNull
	@Size(max = 5)
	@Column(name = "zip")
	private String zip;
	
	@NotNull
	@Size(max = 12)
	@Column(name = "telephone")
	private String telephone;
	
	@NotNull
	@Size(max = 30)
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Size(max = 30)
	@Column(name = "surveydate")
	private String surveydate;
	
	@Size(max = 200)
	@Column(name = "qualities")
	private String qualities;
	
	@Size(max = 20)
	@Column(name = "referral")
	private String satisfaction;
	
	@Size(max = 20)
	@Column(name = "satisfaction")
	private String referral;
	
	Survey() {
		this.id = (long) 0;
		this.fname = "First";
		this.lname = "Last";
		this.address = "XXXX NAME STREET";
		this.city = "CITY";
		this.state = "XX";
		this.zip = "XXXXX";
		this.telephone = "XXX-XXX-XXX";
		this.email = "XXXXXX@XXXX.XXX";
		this.surveydate = "XX-XX-XXXX";
		this.qualities = "XXXX,XXXX,XXXX";
		this.satisfaction = "GOOD";
		this.referral = "TELEVISION";
	}
	
	Survey(Long id, String fname, String lname, String address, String city, String state, String zip, String telephone, String email, String surveydate, String qualities, String satisfaction, String referral) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.telephone = telephone;
		this.email = email;
		this.surveydate = surveydate;
		this.qualities = qualities;
		this.satisfaction = satisfaction;
		this.referral = referral;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSurveydate() {
		return surveydate;
	}

	public void setSurveydate(String surveydate) {
		this.surveydate = surveydate;
	}

	public String getQualities() {
		return qualities;
	}

	public void setQualities(String qualities) {
		this.qualities = qualities;
	}
	
	public String getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getReferral() {
		return referral;
	}

	public void setReferral(String referral) {
		this.referral = referral;
	}
	
	@Override
	public boolean equals(Object survey) {
		if (this == survey)
			return true;
		if (!(survey instanceof Survey))
			return false;
		Survey o = (Survey) survey;
		return  (Objects.equals(this.id, o.id) &&
				Objects.equals(this.fname, o.fname) &&
				Objects.equals(this.lname, o.lname) && 
				Objects.equals(this.address, o.address) && 
				Objects.equals(this.city, o.city) && 
				Objects.equals(this.state, o.state) && 
				Objects.equals(this.zip, o.zip) && 
				Objects.equals(this.telephone, o.telephone) && 
				Objects.equals(this.email, o.email) && 
				Objects.equals(this.surveydate, o.surveydate) && 
				Objects.equals(this.qualities, o.qualities) && 
				Objects.equals(this.satisfaction, o.satisfaction) && 
				Objects.equals(this.referral, o.referral));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.fname, this.lname, this.address,	this.city, this.state, this.zip, this.telephone,
							this.email, this.surveydate, this.satisfaction, this.referral);
	}
	
	@Override
	public String toString() {
		return "entities.Survey[ surveyId=" + id + " ]";
	}
}
