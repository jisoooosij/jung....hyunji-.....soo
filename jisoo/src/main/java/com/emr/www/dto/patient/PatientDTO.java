package com.emr.www.dto.patient;

import java.math.BigDecimal;




public class PatientDTO {
	
	private int no;
	private String name;
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecurityNum() {
		return securityNum;
	}

	public void setSecurityNum(String securityNum) {
		this.securityNum = securityNum;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public BigDecimal getTemperature() {
		return temperature;
	}

	public void setTemperature(BigDecimal temperature) {
		this.temperature = temperature;
	}

	public Character getSmokingStatus() {
		return smokingStatus;
	}

	public void setSmokingStatus(Character smokingStatus) {
		this.smokingStatus = smokingStatus;
	}

	private String securityNum;
	private Character gender;
	private String address;
	private String phone;
	private String email;
	private String bloodType;
	private Float height;
	private Float weight;
	private String allergies;
	private String bloodPressure;
	private BigDecimal temperature;
	private Character smokingStatus;

	// id를 제외한 생성자 (새 환자 등록 시 사용)
	public PatientDTO() {
		this.name = name;
		this.securityNum = securityNum;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.bloodType = bloodType;
		this.height = height;
		this.weight = weight;
		this.allergies = allergies;
		this.bloodPressure = bloodPressure;
		this.temperature = temperature;
		this.smokingStatus = smokingStatus;
	}

	// 모든 필드를 포함하는 생성자 (기존 환자 정보 조회 시 사용)
	//    public PatientDTO(Long id, String name, String securityNum, Character gender, 
	//                      String address, String phone, String email, String bloodType, 
	//                      Integer height, Integer weight, String allergies, 
	//                      String bloodPressure, BigDecimal temperature, Character smokingStatus) {
	//        this(name, securityNum, gender, address, phone, email, bloodType, 
	//             height, weight, allergies, bloodPressure, temperature, smokingStatus);
	//        this.id = id;
	//    }
}

/*
 * 
 * DTO에서:
 * 
 * id 필드를 Integer 대신 Long으로 정의하는 것이 좋습니다. 이는 MySQL의 INT 타입이 Java의 Long과 더 잘 매핑되기
 * 때문입니다. 환자 등록 시:
 * 
 * 새 환자를 데이터베이스에 삽입할 때 id 필드를 명시하지 않거나 null로 설정합니다. JPA/Hibernate를 사용하는 경우:
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) 어노테이션을 id 필드에 추가
 */