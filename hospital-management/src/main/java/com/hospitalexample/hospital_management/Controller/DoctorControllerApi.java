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
                 public HashMap<Integer, DoctorClass> findAllDoctors()
                   {
                    return doctorClassdb;
                   }

                   //@PathVariable  input is taken as path variable
                    @GetMapping("/find/{id}")
                    public DoctorClass findAllDoctorsBYId(@PathVariable int id )
                   {
                    DoctorClass doctor=doctorClassdb.get( id);
                     return doctor;
                   }
                  @DeleteMapping("/delete/{id}")
                 public String deleteDoctorById(@PathVariable  int id)
                 {
                    doctorClassdb.remove( id);
                     return "doctor id is deleted "+ id;
                 }
                 @PutMapping("/update/{id}")
                  public String updateDoctor( @PathVariable int id ,@RequestBody   DoctorClass updatedDoctorRequest )
                 {
                     //checking if doctor detail is available or not
                     //if doctor is available then we update otherwise not
                     DoctorClass doctor = doctorClassdb.get(id);
                     if(doctor!= null) {
                         doctorClassdb.put(updatedDoctorRequest.getId(), updatedDoctorRequest);
                         return "Doctor detail is found and updated";

                     }
                     else
                     {
                         return "Doctor detail is not found";
                     }

                 }
        }


