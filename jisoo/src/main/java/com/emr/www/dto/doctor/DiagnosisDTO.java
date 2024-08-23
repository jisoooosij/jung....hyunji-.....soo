package com.emr.www.dto.doctor;


public class DiagnosisDTO {

	private int no;
	private int chartNum;
	private String diseaseCode;
	private String diseaseName;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getChartNum() {
		return chartNum;
	}
	public void setChartNum(int chartNum) {
		this.chartNum = chartNum;
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
}