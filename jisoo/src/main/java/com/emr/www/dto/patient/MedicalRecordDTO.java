package com.emr.www.dto.patient;

import java.time.LocalDateTime;

public class MedicalRecordDTO {

	private int chartNum;
	private int patientId;
	private int docId;
	private String symptoms;
	public int getChartNum() {
		return chartNum;
	}
	public void setChartNum(int chartNum) {
		this.chartNum = chartNum;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
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
	private String surgeryStatus;
	private String progress;
	private LocalDateTime visitDate;
}
