package com.univ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Applicant")
public class Applicant {
	@Id
    @GeneratedValue
    private int applicantId;
    private String applicantName;
    private String mobileNumber;
    private String applicantDegree;
    private int applicantGraduationPercent;
	private String applicantStatus;
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Applicant(int applicantId, String applicantName, String mobileNumber, String applicantDegree,
			int applicantGraduationPercent, String applicantStatus) {
		super();
		this.applicantId = applicantId;
		this.applicantName = applicantName;
		this.mobileNumber = mobileNumber;
		this.applicantDegree = applicantDegree;
		this.applicantGraduationPercent = applicantGraduationPercent;
		this.applicantStatus = applicantStatus;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getApplicantDegree() {
		return applicantDegree;
	}
	public void setApplicantDegree(String applicantDegree) {
		this.applicantDegree = applicantDegree;
	}
	public int getApplicantGraduationPercent() {
		return applicantGraduationPercent;
	}
	public void setApplicantGraduationPercent(int applicantGraduationPercent) {
		this.applicantGraduationPercent = applicantGraduationPercent;
	}
	public String getApplicantStatus() {
		return applicantStatus;
	}
	public void setApplicantStatus(String applicantStatus) {
		this.applicantStatus = applicantStatus;
	}
	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", applicantName=" + applicantName + ", mobileNumber="
				+ mobileNumber + ", applicantDegree=" + applicantDegree + ", applicantGraduationPercent="
				+ applicantGraduationPercent + ", applicantStatus=" + applicantStatus + "]";
	}
   
	
    
    
    

	
	

}
