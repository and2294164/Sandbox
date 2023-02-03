package org.example.aggregation;

import java.io.*;
import java.util.*;

public class Folder {

    List<File> files = new ArrayList<>();

    public Folder() {

        for (int i = 1; i <= 10; ++i) {

            // composition
            files.add(new File());

        }

        System.out.println("Number of files: " + files.size());
    }

    public Folder(File[] f) {

        // I don't know how this works but the IDE recommended it to me
        Collections.addAll(files, f);

        System.out.println("Number of files: " + files.size());
    }
}
