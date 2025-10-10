package com.hospitalexample.hospital_management.Controller;

import com.hospitalexample.hospital_management.Model.DoctorClass;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/doctor/apis")

public class DoctorControllerApi {
//taking database as hasmap declare and define
    HashMap<Integer, DoctorClass>doctorClassdb=new HashMap<>();

     @PostMapping("/save")
     public String saveDoctor( @RequestBody DoctorClass inputdoctorRequest)
     {
         //input request is coming and add it into hasmap
         //@RequestBody//takes the input or request from postman  and assign to Doctot object body with all attributes
         doctorClassdb.put(inputdoctorRequest.getId(),inputdoctorRequest);
         
         return "Doctor details are saved ";
     }


                @GetMapping("/findAll")
                 public HashMap<Integer, DoctorClass> findAllDoctors() {
                    return doctorClassdb;
                   }

                   //@PathVariable  input is taken as path variable
                    @GetMapping("/find/{id}")
                    public DoctorClass findAllDoctorsBYId(@PathVariable int id )
                   {
                    DoctorClass doctor=doctorClassdb.get( id);
                     return doctor;
                   }

}
