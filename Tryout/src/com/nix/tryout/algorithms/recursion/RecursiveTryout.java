package com.nix.tryout.algorithms.recursion;

public class RecursiveTryout {
	
	int start = 0;
	
	public void calc(int st, int end) {
		
		if(start < end) {
			System.out.print(start + ", ");
			start += st;
			System.out.print(start + ", ");
			calc(start, end);
		}
		
	}
	
	public void extractUrl(String content) {
		RedisAdd rAdd = new RedisAdd();
		
		if(FileTypeCheckerUtil.isUrlFile(content)) {
			rAdd.add(content);
		}
		else if(FileTypeCheckerUtil.isXmlFile(content)) {
			extractUrl(content);
		}
		
		
	}
	
	public static void main(String...strings ) {
		
		

		
	}
}

class XmlFile {

	public String readLine() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class RedisAdd {

	public void add(String content) {
		// TODO Auto-generated method stub
		
	}
	
}

class FileTypeCheckerUtil{
	
	public static boolean isXmlFile(String content) {
		return true;
	}
	
	public static boolean isUrlFile(String content) {
		return true;
	}
}