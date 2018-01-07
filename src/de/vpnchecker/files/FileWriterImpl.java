package de.vpnchecker.files;

import java.io.File;
import java.io.FileWriter;

public class FileWriterImpl {

    public void writeFilePath(String path) {

        String fileName = "path.txt";

        try {
            File file = new File(fileName);

            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();

            // creates a FileWriter Object
            FileWriter writer = new FileWriter(file);

            // Writes the content to the file
            writer.write(path);
            writer.flush();
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }

}
