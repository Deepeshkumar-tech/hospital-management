package com.student_management_system2.example.student_management_system2.service;

import com.student_management_system2.example.student_management_system2.requestbody.StudentRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.net.URI;

@Service
public class StudentService
{   @Autowired
      StudentRequestBody studentRequestBody;
       RestTemplate restTemplate;
//    public StudentService(RestTemplate restTemplate)
//    {
//        this.restTemplate = restTemplate;
//    }

    public void saveStudent(StudentRequestBody studentRequestBody)
    {
       //create RequestEntity
       //create URL
        URI url=URI.create("http://localhost:8080/api/db/save");
        //creating request
        RequestEntity<StudentRequestBody> req=RequestEntity.post(url).body(studentRequestBody);
        //creating response and restTemplate method to call another Db api

        RestTemplate restTemplate =new RestTemplate();

        ResponseEntity<String> resp =restTemplate.exchange(url, HttpMethod.POST,req,String.class);

    }

    public Object callWeatherApi( String XRapidAPIKey,String city)
    {
       String urlPath="https://weather-api167.p.rapidapi.com/api/weather/current?";
       urlPath+="access_key="+XRapidAPIKey;
       urlPath+="&query="+city;
        URI url=URI.create( urlPath);
        //create request entity
        RequestEntity requestEntity=RequestEntity.get(url).build();

        //hitting requestEntity
       // RestTemplate restTemplate=new RestTemplate();
        int count=1;
        while (count>=1) {
            ResponseEntity<Object> resp = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Object.class);
            count++;
        }
        Object object=resp.getBody();
        return object;


    }
    public void Sum(int a,int b)
    {
        return a+b;
    }

}
