package com.emr.www.controller.doctor;

import com.emr.www.service.doctor.DoctorService;
import com.emr.www.entity.doctor.dto.DoctorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/doctorCreate")
    @ResponseBody
    public String createDoctor(@ModelAttribute DoctorDto doctorDto) {
        doctorService.createDoctor(doctorDto);
        return "Doctor successfully created!";
    }
}
