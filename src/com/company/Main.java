package com.company;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static FileWriter fs;

    public static void main(String[] args) throws IOException {
        try {
            fs = new FileWriter("hoyo");
        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
        }

        try {
            File file = new File("hoyo");

            try (Scanner sn = new Scanner(file)) {
                String text = "aiwa ka mwana ndomuda";

                while (sn.hasNextLine()) {
                    text = text.concat(sn.nextLine());
                }
                fs.write(text);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            fs.close();
        }
    }
}
