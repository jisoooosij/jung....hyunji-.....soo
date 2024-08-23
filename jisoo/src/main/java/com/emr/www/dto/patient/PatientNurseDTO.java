package com.emr.www.dto.patient;

import java.time.LocalDate;


//간호사 환자 관계 DTO (PatientNurseDTO)

public class PatientNurseDTO {

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
	public int getNurseId() {
		return nurseId;
	}
	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
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
	private int no;
	private int patientId;
	private int nurseId;
	private LocalDate relationshipStartDate;
	private LocalDate relationshipEndDate;
}
	