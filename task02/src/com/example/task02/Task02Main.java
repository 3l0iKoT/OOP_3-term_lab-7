package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        ConvertToUnix();
    }

    public static void ConvertToUnix() throws IOException {

        int currentStroke = System.in.read();
        int nextStroke;

        while(currentStroke != -1){
            nextStroke = System.in.read();

            if (currentStroke != 13 || nextStroke != 10)
                System.out.write(currentStroke);

            currentStroke = nextStroke;
        }

        System.out.flush();
    }
}
