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
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 300)
	@Column(name = "survey_id")
	private Long id;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 50)
	@Column(name = "first_name")
	private String first_name;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 50)
	@Column(name = "last_name")
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
	@Column(name = "phone_number")
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
	
	@Column(name = "like_students")
	private int like_students;
	
	@Column(name = "like_location")
	private int like_location;
	
	@Column(name = "like_campus")
	private int like_campus;
	
	@Column(name = "like_atmosphere")
	private int like_atmosphere;
	
	@Column(name = "like_dorm_rooms")
	private int like_dorm_rooms;
	
	@Column(name = "like_sports")
	private int like_sports;
	
	@Size(max = 20)
	@Column(name = "interest")
	private String interest;
	
	@Size(max = 20)
	@Column(name = "will_recommend")
	private String will_recommend;
	
	Survey() {}
	
	Survey(Long id, String first_name, String last_name, String address, String city, String state, String zip, String phone_number, String email, String survey_date,
			int like_students, int like_location, int like_campus, int like_atmosphere, int like_dorm_rooms, int like_sports, String interest, String will_recommend) {
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
		this.like_students = like_students;
		this.like_location = like_location;
		this.like_campus = like_campus;
		this.like_atmosphere = like_atmosphere;
		this.like_dorm_rooms = like_dorm_rooms;
		this.like_sports = like_sports;
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

	public int getLikeStudents() {
		return like_students;
	}

	public void setLikeStudents(int like_students) {
		this.like_students = like_students;
	}

	public int getLikeLocation() {
		return like_location;
	}

	public void setLikeLocation(int like_location) {
		this.like_location = like_location;
	}

	public int getLikeCampus() {
		return like_campus;
	}

	public void setLikeCampus(int like_campus) {
		this.like_campus = like_campus;
	}

	public int getLikeAtmosphere() {
		return like_atmosphere;
	}

	public void setLikeAtmosphere(int like_atmosphere) {
		this.like_atmosphere = like_atmosphere;
	}

	public int getLikeDormRooms() {
		return like_dorm_rooms;
	}

	public void setLikeDormRooms(int like_dorm_rooms) {
		this.like_dorm_rooms = like_dorm_rooms;
	}

	public int getLikeSports() {
		return like_sports;
	}

	public void setLikeSports(int like_sports) {
		this.like_sports = like_sports;
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
				Objects.equals(this.like_students, o.like_students) && 
				Objects.equals(this.like_location, o.like_location) && 
				Objects.equals(this.like_campus, o.like_campus) && 
				Objects.equals(this.like_atmosphere, o.like_atmosphere) && 
				Objects.equals(this.like_dorm_rooms, o.like_dorm_rooms) && 
				Objects.equals(this.like_sports, o.like_sports) && 
				Objects.equals(this.interest, o.interest) && 
				Objects.equals(this.will_recommend, o.will_recommend));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.first_name, this.last_name, this.address,	this.city, this.state, this.zip, this.phone_number,
							this.email, this.date, this.like_students, this.like_location, this.like_campus,	this.like_atmosphere,
							this.like_dorm_rooms, this.like_sports,	this.interest, this.will_recommend);
	}
	
	@Override
	public String toString() {
		return "entities.Survey[ surveyId=" + id + " ]";
	}
}
