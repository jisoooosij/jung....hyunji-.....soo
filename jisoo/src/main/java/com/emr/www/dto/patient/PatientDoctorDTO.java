package com.emr.www.dto.patient;

import java.time.LocalDate;


//의사 환자 관계 DTO (PatientDoctorDTO)

public class PatientDoctorDTO {

	private int no;
	private int patientId;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public LocalDate getRelationshipStartDate() {
		return relationshipStartDate;
	}
	public void setRelationshipStartDate(LocalDate relationshipStartDate) {
		this.relationshipStartDate = relationshipStartDate;
	}
	public LocalDate getRelationshipEndDate() {
		return relationshipEndDate;
	}
	public void setRelationshipEndDate(LocalDate relationshipEndDate) {
		this.relationshipEndDate = relationshipEndDate;
	}
	private int doctorId;
	private LocalDate relationshipStartDate;
	private LocalDate relationshipEndDate;
}
