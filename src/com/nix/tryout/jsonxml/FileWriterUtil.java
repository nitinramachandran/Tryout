package com.nix.tryout.jsonxml;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
    public static void writeFileAsJSON(String folderName, String filename, Object obj) throws IOException {
        File file = new File(folderName);
        file.mkdir();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file.getName()+File.separator+filename));
        writer.write(new Gson().toJson(obj));

        writer.close();
    }
}
