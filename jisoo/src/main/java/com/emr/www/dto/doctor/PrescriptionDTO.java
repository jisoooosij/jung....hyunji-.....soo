package com.emr.www.dto.doctor;


public class PrescriptionDTO {
    private int no;
    private int chartNum;
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
	public int getChartNum() {
		return chartNum;
	}
	public void setChartNum(int chartNum) {
		this.chartNum = chartNum;
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