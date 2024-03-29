package com.bitlabs.entity;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.*;
import javax.validation.groups.*;

@Entity
public class JobRecruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recruiterId;

    @NotBlank(message = "Company name is required")
    private String companyName;
    

    @Column(unique = true) // Add unique constraint
    @Email(message = "Valid email is required")
    @NotBlank(message = "Email is required")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters long")
    @NotBlank(message = "Password is required")
    private String password;

    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits")
    @NotBlank(message = "Mobile number is required")
    private String mobile;

    @NotBlank(message = "Type of company is required")
    private String typeOfCompany;
    
    @NotBlank(message = "Type of role is required")
    private String role;
    
    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}

	@NotBlank(message = "team size  is required")
    private String teamSize;


	public Long getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTypeOfCompany() {
		return typeOfCompany;
	}

	public void setTypeOfCompany(String typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}

	public JobRecruiter(Long recruiterId, @NotBlank(message = "Company name is required") String companyName,
			@Email(message = "Valid email is required") @NotBlank(message = "Email is required") String email,
			@Size(min = 6, message = "Password must be at least 6 characters long") @NotBlank(message = "Password is required") String password,
			@Pattern(regexp = "\\d{10}", message = "Mobile number must be 10 digits") @NotBlank(message = "Mobile number is required") String mobile,
			@NotBlank(message = "Type of company is required") String typeOfCompany,
			@NotBlank(message = "Type of role is required") String role,
			@NotBlank(message = "team size  is required") String teamSize) {
		super();
		this.recruiterId = recruiterId;
		this.companyName = companyName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.typeOfCompany = typeOfCompany;
		this.role = role;
		this.teamSize = teamSize;
	}

	public JobRecruiter() {
		
	}

	

	
	

    
    // Constructors can also be automatically generated by Lombok if needed
}


