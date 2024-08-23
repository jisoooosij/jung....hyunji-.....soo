package com.emr.www.entity.doctor;

import com.emr.www.entity.patient.MedicalRecordEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "Diagnosis")
public class DiagnosisEntity {

	// 필요한 생성자 추가
	public DiagnosisEntity(String diseaseCode, String diseaseName) {
		this.setDiseaseCode(diseaseCode);
		this.setDiseaseName(diseaseName);
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public MedicalRecordEntity getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecordEntity medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;

	@ManyToOne
	@JoinColumn(name = "chartNum", referencedColumnName = "chartNum")
	private MedicalRecordEntity medicalRecord;

	private String diseaseCode;
	private String diseaseName;
}