package com.emr.www.service.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emr.www.entity.doctor.Doctor;
import com.emr.www.entity.doctor.dto.DoctorDto;
import com.emr.www.repository.doctor.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
    private DoctorRepository doctorRepository;

    public void createDoctor(DoctorDto doctorDto) {
        Doctor doctor = new Doctor();
        doctor.setName(doctorDto.getName());
        doctor.setPhone(doctorDto.getPhone());
        doctor.setSecurityNum(doctorDto.getSecurityNum());
        doctor.setEmail(doctorDto.getEmail());
        doctor.setJobTitle(doctorDto.getJobTitle());
        doctor.setDepartment(doctorDto.getDepartment());
        doctor.setSpecialty(doctorDto.getSpecialty());
        doctorRepository.save(doctor);
    }
}
