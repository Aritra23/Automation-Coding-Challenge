package com.java.challenge;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestWord {

	/**
	 * @param args
	 */
	public Map<String, Integer> findLongestWord(String s){
		String maxlenword = null;
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		if(s == null || s.length() == 0){
			return Collections.emptyMap();
		}
		String[] str = s.split(" ");
		int maxlen = 0;
		for(int i = 0; i < str.length; i++){
			map.put(str[i], str[i].length());
		}
	    for(Map.Entry<String, Integer> entry: map.entrySet()){
	    	if(entry.getValue() > maxlen){
	    		maxlen = entry.getValue();
	    		maxlenword = entry.getKey();
	    	}
	    }
		Map<String, Integer> outputmap = new LinkedHashMap<String, Integer>();
		outputmap.put(maxlenword, maxlen);
		return outputmap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLongestWord ob = new FindLongestWord();
		System.out.println(ob.findLongestWord("The cow jumped over the moon"));
	}

}
