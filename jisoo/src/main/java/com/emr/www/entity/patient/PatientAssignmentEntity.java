package com.emr.www.entity.patient;

import java.time.LocalDate;

import com.emr.www.entity.doctor.DoctorEntity;
import com.emr.www.entity.nurse.NurseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


//환자 - 의사, 간호사 배정 테이블

@Entity
@Table(name = "PatientAssignment")
public class PatientAssignmentEntity {

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

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public NurseEntity getNurse() {
		return nurse;
	}

	public void setNurse(NurseEntity nurse) {
		this.nurse = nurse;
	}

	public LocalDate getAssignmentDate() {
		return assignmentDate;
	}

	public void setAssignmentDate(LocalDate assignmentDate) {
		this.assignmentDate = assignmentDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;

	@ManyToOne
	@JoinColumn(name = "patientId", referencedColumnName = "no", nullable = false)
	private PatientRegistrationEntity patient;

	@ManyToOne
	@JoinColumn(name = "doctorId", referencedColumnName = "no")
	private DoctorEntity doctor;

	@ManyToOne
	@JoinColumn(name = "nurseId", referencedColumnName = "no")
	private NurseEntity nurse;

	private LocalDate assignmentDate;
}
