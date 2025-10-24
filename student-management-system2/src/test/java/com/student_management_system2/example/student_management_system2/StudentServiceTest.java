package com.student_management_system2.example.student_management_system2;

import com.student_management_system2.example.student_management_system2.service.StudentService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class StudentServiceTest
{
    @Mock
    RestTemplate  restTemplate; //created mock annotation because i don't want create  actual objects of class

    @InjectMocks
    StudentService studentService;//  here we inject mock into studentService class to create dummy objects of actual class

    @BeforeEach
    public void setUp()
    {
        System.out.println("Hello");
        MockitoAnnotations.openMocks(this);
    }

    @AfterAll
    public void closeMocks()
    {

    }

    @Test

    public void exchangeMethodShouldCalledOneTime()
    {
        //expected url  and actual url are same
        //expected url --whether access key,city

        String expectedUrl1="https://weather-api167.p.rapidapi.com/api/weather/current?access_key=test&query=xyz"
        URI expectedUrl2= URI.create(expectedUrl1);
        studentService.callWeatherApi( XRapidAPIKey:"test",city:"xyz");
        verify(restTemplate,times(wantedNumberOfInvocation:1)).exchange(equals(expectedUrl2),eq(HttpMethod.GET),eq(requestEntity),any(Object.class));

    }

    @Test
    public void Test2()
    {

    }

    @Test
    public void testSum()
    {
        int expectedSum=13;
       int actualSum=studentService.Sum(5,8);
        assertEquals(expectedSum,actualSum);
    }

}
