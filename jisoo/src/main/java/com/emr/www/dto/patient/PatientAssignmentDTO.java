package com.emr.www.dto.patient;

import java.time.LocalDate;


public class PatientAssignmentDTO {
    private int no;
    private int patientId;
    private int doctorId;
    private int nurseId;
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
	public int getNurseId() {
		return nurseId;
	}
	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}
	public LocalDate getAssignmentDate() {
		return assignmentDate;
	}
	public void setAssignmentDate(LocalDate assignmentDate) {
		this.assignmentDate = assignmentDate;
	}
	private LocalDate assignmentDate;
}
