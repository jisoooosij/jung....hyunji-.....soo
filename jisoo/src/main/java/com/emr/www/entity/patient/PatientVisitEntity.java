package com.emr.www.entity.patient;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//환자 내원 테이블

@Entity
@Table(name = "PatientVisits")
public class PatientVisitEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;

    private LocalDate visitDate;
    private LocalTime visitTime;
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

	public LocalTime getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(LocalTime visitTime) {
		this.visitTime = visitTime;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public PatientRegistrationEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientRegistrationEntity patient) {
		this.patient = patient;
	}

	private String patientName;
    private String visitReason;
    private String doctorName;
    private String nurseName;
    private String visitHistory;

    @ManyToOne
    @JoinColumn(name = "securityNum", referencedColumnName = "securityNum")
    private PatientRegistrationEntity patient;
}