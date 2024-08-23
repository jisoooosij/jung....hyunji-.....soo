package com.emr.www.entity.patient;

import java.time.LocalDate;

import com.emr.www.entity.nurse.NurseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


//간호사 환자 관계 테이블

@Entity
@Table(name = "PatientNurse")
public class PatientNurseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;

	@ManyToOne
	@JoinColumn(name = "patientId", referencedColumnName = "no", nullable = false)
	private PatientRegistrationEntity patient;

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public PatientRegistrationEntity getPatient() {
		return patient;
	}
	public void setPatient(PatientRegistrationEntity patient) {
		this.patient = patient;
	}
	public NurseEntity getNurse() {
		return nurse;
	}
	public void setNurse(NurseEntity nurse) {
		this.nurse = nurse;
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
	@ManyToOne
	@JoinColumn(name = "nurseId", referencedColumnName = "no", nullable = false)
	private NurseEntity nurse;

	private LocalDate relationshipStartDate;
	private LocalDate relationshipEndDate;
}