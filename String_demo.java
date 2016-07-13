package com.hadoop.demo;

import java.util.ArrayList;
import java.util.List;

public class String_demo {

	public static void main(String[] args) {
		String line="Hadoop is open source frame work ,Hadoop is good framework for handling big data";
		line = line.replace(",", " ");
		int count = 0;
		String strArr[] =  line.split(" ");
		List<String> stringList = new ArrayList<String>();
		for (String word : strArr) {
			stringList.add(word);
			if(word.equals("Hadoop")){
				count++;
			}
		}
		System.out.println("The word Hadoop Ocuured "+count+" times");
		System.out.println("The output of Array List "+ stringList);
	}

}