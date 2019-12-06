package com.qjfcc.demo001;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qjfcc.demo001.model.PersonDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@SpringBootApplication
public class Demo001Application {

    public static void main(String[] args) throws IOException {

        MergeLinkedService linkedService = new MergeLinkedService();
        ListNode listNode = linkedService.mergeTwoLists2(stringToListNode(",2,"),stringToListNode(",1,"));
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

return;

//        ClassLoader classLoader = PersonDto.class.getClassLoader();
//        while (classLoader!=null){
//            System.out.println(classLoader.toString());
//            classLoader = classLoader.getParent();
//        }
//
//        String[] strings = {"123","456"};
//        List<String> stringList = Arrays.asList(strings);
//
//        int total = 20000;
//        PersonDto personDto = new PersonDto(1, "a1111111", 1, "");
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        for (int i = 0; i < total; i++) {
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.writeValueAsString(personDto);
////            mapper.readValue(s,PersonDto.class);
//        }
//        stopWatch.stop();
//
//        System.out.println(String.format("jackson:%s ms", stopWatch.getTotalTimeMillis()));
//
//        System.out.println(Pattern.compile("^(?i)and_(?!(cctalk$))\\S+").matcher("and_cCtalk1").matches());
//        System.out.println(Pattern.compile("^(?i)and_(?!(cctalk$))\\S+").matcher("and_cctalk").matches());
//        System.out.println(Pattern.compile("^(?i)and_(?!(cctalk$))\\S+").matcher("and_cctal").matches());

//        SpringApplication.run(Demo001Application.class, args);
    }


    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
}
