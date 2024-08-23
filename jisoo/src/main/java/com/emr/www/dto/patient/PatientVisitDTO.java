package com.emr.www.dto.patient;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class PatientVisitDTO {

	private int no;
	private LocalDate visitDate;
	private LocalDateTime visitTime;
	private String patientName;
	private String securityNum;
	private String visitReason;
	private String doctorName;
	private String nurseName;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public LocalDate getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}
	public LocalDateTime getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(LocalDateTime visitTime) {
		this.visitTime = visitTime;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getSecurityNum() {
		return securityNum;
	}
	public void setSecurityNum(String securityNum) {
		this.securityNum = securityNum;
	}
	public String getVisitReason() {
		return visitReason;
	}
	public void setVisitReason(String visitReason) {
		this.visitReason = visitReason;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getNurseName() {
		return nurseName;
	}
	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}
	public String getVisitHistory() {
		return visitHistory;
	}
	public void setVisitHistory(String visitHistory) {
		this.visitHistory = visitHistory;
	}
	private String visitHistory;
}
