package com.nix.tryout.files;

import java.io.File;

public class FindFileThroughRecursion {
	
	static String absoluteFilePath = null;

	static String findFile() {
		
		findFile("/Users/nitinramachandran/Documents");
		
		return absoluteFilePath;
	}

	private static void findFile(String string) {
		
		File initFile = new File(string);
		
		File[] files = initFile.listFiles();
		
		for(File file : files) {

			if(file.isDirectory()) {
				findFile(file.getAbsolutePath());
			}
			else if(file.isFile()) {
				if(file.getName().equals("trial_file.txt")) {
					absoluteFilePath = file.getAbsolutePath();
					break;
				}
			}
		}
	}
	
	public static void main(String... strings) {
		System.out.println("The Absolute Path is : " + findFile());
	}
}
