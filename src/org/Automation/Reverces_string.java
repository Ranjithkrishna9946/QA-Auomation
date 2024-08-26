package org.Automation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Reverces_string {

	public static void main(String[] args) {
		String str="RamRam";
		Set<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++) {
			
			set.add(str.charAt(i));
		}
			
		StringBuffer sb=new StringBuffer();
		
		for(Character s:set) {
			sb.append(s);
		}
		System.out.println(sb);
	}
	
	
}
