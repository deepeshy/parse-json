package com.dy.json.parse;

import com.dy.json.model.TestSimple;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class Parser {
    public static void main(String[] args) {
        try {
            ObjectMapper om = new ObjectMapper();
            InputStream testFileStream = Parser.class.getClassLoader().getResourceAsStream("testsimple.json");
            TestSimple testSimple = om.readValue(testFileStream, TestSimple.class);
            System.out.println(testSimple);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
