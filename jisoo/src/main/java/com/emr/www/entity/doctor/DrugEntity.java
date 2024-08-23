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
@Table(name = "Drugs")
public class DrugEntity {

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
	public String getCpntCd() {
		return cpntCd;
	}
	public void setCpntCd(String cpntCd) {
		this.cpntCd = cpntCd;
	}
	public String getIngdNameKor() {
		return ingdNameKor;
	}
	public void setIngdNameKor(String ingdNameKor) {
		this.ingdNameKor = ingdNameKor;
	}
	public String getFomlNm() {
		return fomlNm;
	}
	public void setFomlNm(String fomlNm) {
		this.fomlNm = fomlNm;
	}
	public String getDosageRouteCode() {
		return dosageRouteCode;
	}
	public void setDosageRouteCode(String dosageRouteCode) {
		this.dosageRouteCode = dosageRouteCode;
	}
	public String getDayMaxDosgQyUnit() {
		return dayMaxDosgQyUnit;
	}
	public void setDayMaxDosgQyUnit(String dayMaxDosgQyUnit) {
		this.dayMaxDosgQyUnit = dayMaxDosgQyUnit;
	}
	public String getDayMaxDosgQy() {
		return dayMaxDosgQy;
	}
	public void setDayMaxDosgQy(String dayMaxDosgQy) {
		this.dayMaxDosgQy = dayMaxDosgQy;
	}
	// 필요한 생성자 추가
	public DrugEntity(String cpntCd, String ingdNameKor, String fomlNm, String dosageRouteCode, String dayMaxDosgQyUnit, String dayMaxDosgQy) {
		this.cpntCd = cpntCd;
		this.ingdNameKor = ingdNameKor;
		this.fomlNm = fomlNm;
		this.dosageRouteCode = dosageRouteCode;
		this.dayMaxDosgQyUnit = dayMaxDosgQyUnit;
		this.dayMaxDosgQy = dayMaxDosgQy;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;

	@ManyToOne
	@JoinColumn(name = "chartNum", referencedColumnName = "chartNum")
	private MedicalRecordEntity medicalRecord;

	private String cpntCd;
	private String ingdNameKor;
	private String fomlNm;
	private String dosageRouteCode;
	private String dayMaxDosgQyUnit;
	private String dayMaxDosgQy;
}
