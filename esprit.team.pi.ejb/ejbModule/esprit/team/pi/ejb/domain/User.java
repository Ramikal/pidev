package esprit.team.pi.ejb.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;





@Entity
@Table(name = "user")
public class User implements Serializable{
	@Id
	@Column(name = "ID_USER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "BIRTH_DATE")
	private Date birthDate;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PWD")
	private String pwd;
	@Column(name = "CAVING_INTEREST")
	private Boolean caving=false;
	@Column(name = "LUXURY_INTEREST")
	private Boolean luxury=false;
	@Column(name = "ART_INTEREST")
	private Boolean art=false;
	@Column(name = "SWIMMING_INTEREST")
	private Boolean swimming=false;
	@Column(name = "FESTIVALS_INTEREST")
	private Boolean festivals=false;
	
	public Boolean getCaving() {
		return caving;
	}
	public void setCaving(Boolean caving) {
		this.caving = caving;
	}
	public Boolean getLuxury() {
		return luxury;
	}
	public void setLuxury(Boolean luxury) {
		this.luxury = luxury;
	}
	public Boolean getArt() {
		return art;
	}
	public void setArt(Boolean art) {
		this.art = art;
	}
	public Boolean getSwimming() {
		return swimming;
	}
	public void setSwimming(Boolean swimming) {
		this.swimming = swimming;
	}
	public Boolean getFestivals() {
		return festivals;
	}
	public void setFestivals(Boolean festivals) {
		this.festivals = festivals;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
