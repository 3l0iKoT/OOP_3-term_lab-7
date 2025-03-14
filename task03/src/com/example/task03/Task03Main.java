package com.example.task03;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();

        Reader reader = new InputStreamReader(inputStream, charset);

        StringBuilder stringBuilder = new StringBuilder();
        int input;

        while ((input = reader.read()) != -1)
            stringBuilder.append((char)input);

        return stringBuilder.toString();
    }
}
