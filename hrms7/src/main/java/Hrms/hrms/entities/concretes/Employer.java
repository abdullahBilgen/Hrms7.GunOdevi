package Hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
public class Employer {
	

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "birthYear")
	private String birthYear;
	
	@Column(name = "webSite")
	private String webSite;
	
	@Column(name = "eMail")
	private String eMail;
	
	@Column(name = "password")
	private String password;
	

}
