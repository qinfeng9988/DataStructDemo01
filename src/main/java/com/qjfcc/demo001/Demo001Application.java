package com.qjfcc.demo001;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qjfcc.demo001.model.PersonDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

import java.io.IOException;
import java.util.regex.Pattern;

@SpringBootApplication
public class Demo001Application {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = PersonDto.class.getClassLoader();
        while (classLoader!=null){
            System.out.println(classLoader.toString());
            classLoader = classLoader.getParent();
        }

        int total = 20000;
        PersonDto personDto = new PersonDto(1, "a1111111", 1, "");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < total; i++) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValueAsString(personDto);
//            mapper.readValue(s,PersonDto.class);
        }
        stopWatch.stop();

        System.out.println(String.format("jackson:%s ms", stopWatch.getTotalTimeMillis()));

        System.out.println(Pattern.compile("^(?i)and_(?!(cctalk$))\\S+").matcher("and_cCtalk1").matches());
        System.out.println(Pattern.compile("^(?i)and_(?!(cctalk$))\\S+").matcher("and_cctalk").matches());
        System.out.println(Pattern.compile("^(?i)and_(?!(cctalk$))\\S+").matcher("and_cctal").matches());

//        SpringApplication.run(Demo001Application.class, args);
    }

}
