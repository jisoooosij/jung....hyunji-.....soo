package com.emr.www.entity.patient;

import java.time.LocalDateTime;

import com.emr.www.entity.doctor.DoctorEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MedicalRecord")
public class MedicalRecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chartNum;

    @ManyToOne
    @JoinColumn(name = "patientId", referencedColumnName = "no")
    private PatientEntity patient;

    public int getChartNum() {
		return chartNum;
	}
	public void setChartNum(int chartNum) {
		this.chartNum = chartNum;
	}
	public PatientEntity getPatient() {
		return patient;
	}
	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}
	public DoctorEntity getDoctor() {
		return doctor;
	}
	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getSurgeryStatus() {
		return surgeryStatus;
	}
	public void setSurgeryStatus(String surgeryStatus) {
		this.surgeryStatus = surgeryStatus;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public LocalDateTime getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(LocalDateTime visitDate) {
		this.visitDate = visitDate;
	}
	@ManyToOne
    @JoinColumn(name = "docId", referencedColumnName = "no")
    private DoctorEntity doctor;

    private String symptoms;
    private String surgeryStatus;
    private String progress;
    private LocalDateTime visitDate;
}