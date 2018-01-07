package de.vpnchecker.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {

    private static final String FILENAME = "path.txt";

    public String readPathFromFile() {
        BufferedReader br = null;
        String result = "";
        try {
            br = new BufferedReader(new FileReader(FILENAME));
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                if (!sCurrentLine.equals("")) result = sCurrentLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                if (br != null)
                    br.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}




