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
@Table(name = "Prescriptions")
public class PrescriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;

    @ManyToOne
    @JoinColumn(name = "chartNum", referencedColumnName = "chartNum")
    private MedicalRecordEntity medicalRecord;

    private String entpName;
    private String itemSeq;
    private String itemName;
    private String useMethodQesitm;
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
	public String getEntpName() {
		return entpName;
	}
	public void setEntpName(String entpName) {
		this.entpName = entpName;
	}
	public String getItemSeq() {
		return itemSeq;
	}
	public void setItemSeq(String itemSeq) {
		this.itemSeq = itemSeq;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getUseMethodQesitm() {
		return useMethodQesitm;
	}
	public void setUseMethodQesitm(String useMethodQesitm) {
		this.useMethodQesitm = useMethodQesitm;
	}
}