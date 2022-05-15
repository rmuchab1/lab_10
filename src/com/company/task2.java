package com.company;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class task2 {
    static String URL = "hoyo2";
    static FileWriter fs;
    static Scanner sn;
    static File file = new File(URL);

    public static void main(String[] args) throws IOException {
        String text = "drama queens haa munohwina";
        try (FileWriter fs = new FileWriter(file)) {
            fs.write(text);
        }

        try (Scanner sn = new Scanner(file)) {
            while (sn.hasNextLine()) {
                sn.nextLine();
            }
        }
    }
}
