package com.company;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class task3 {
    static String url = "hoyo 3",
            orginal = "hoyo 2",
            storage;

    public static void main(String[] args) throws IOException {
        File f = new File(orginal);
        try {
            Scanner sn = new Scanner(f);
            while (sn.hasNextLine()) {
                storage = sn.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(url)) {
            storage = storage.replaceAll(" ", "-");
            fw.write(storage);
        }
    }
}
