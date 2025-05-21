package com.feedback.reviewuplift.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="businessdetails_entity")
public class BusinessDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String businessName;         
    private String location;              
    private String branch;               
    private String contactEmail;          
    private String contactPhone;         
    private String whatsapp;             
    private String secondaryEmail;        
    private String facebook;              
    private String instagram;            
    private String linkedin;              
    private String website;              
    @Column(length = 1000)
    private String description;          
    private String businessType;          
    private String branchCount;        
    private String customBusinessType;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getBranchCount() {
		return branchCount;
	}
	public void setBranchCount(String branchCount) {
		this.branchCount = branchCount;
	}
	public String getCustomBusinessType() {
		return customBusinessType;
	}
	public void setCustomBusinessType(String customBusinessType) {
		this.customBusinessType = customBusinessType;
	}
	public BusinessDetailsEntity() {
		super();
	}
	public BusinessDetailsEntity(long id, String businessName, String location, String branch, String contactEmail,
			String contactPhone, String whatsapp, String secondaryEmail, String facebook, String instagram,
			String linkedin, String website, String description, String businessType, String branchCount,
			String customBusinessType) {
		super();
		this.id = id;
		this.businessName = businessName;
		this.location = location;
		this.branch = branch;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.whatsapp = whatsapp;
		this.secondaryEmail = secondaryEmail;
		this.facebook = facebook;
		this.instagram = instagram;
		this.linkedin = linkedin;
		this.website = website;
		this.description = description;
		this.businessType = businessType;
		this.branchCount = branchCount;
		this.customBusinessType = customBusinessType;
	} 
    
    
}
