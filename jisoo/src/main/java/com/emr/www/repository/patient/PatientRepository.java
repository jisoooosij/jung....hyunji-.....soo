package com.emr.www.repository.patient;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emr.www.entity.patient.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
    PatientEntity findBySecurityNum(String securityNum);
    List<PatientEntity> findByNameStartingWith(String name); // 환자등록시 이름이 000으로 시작하는 모든 레코드 검색 인터페이스
    List<PatientEntity> findByNameContaining(String name); // 환자내원시 이름으로 검색(이름에 해당 문자열이 포함된 모든 레코드를 검색)하는 인터페이스
    PatientEntity findByNameAndSecurityNum(String name, String securityNum); // 이름과 주민등록번호로 환자 검색
}