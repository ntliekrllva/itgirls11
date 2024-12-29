package ru.kirillova.itgirls.week12;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String file1 = "text1.txt";
        String file2 = "text2.txt";
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter(file1)) {
            System.out.println("Введите строку");
            String s = scanner.nextLine();
            fileWriter.write(s);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}