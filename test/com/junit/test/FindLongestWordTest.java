package com.junit.test;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.java.challenge.FindLongestWord;

public class FindLongestWordTest {

	@Test
	//Test Case for verifying the longest word
	public void test1() {
		FindLongestWord ob = new FindLongestWord();
		Map<String, Integer> testMap = new LinkedHashMap<String, Integer>();
		testMap = ob.findLongestWord("The cow jumped from the cliff");
		for(Map.Entry<String, Integer> entry: testMap.entrySet()){
		assertEquals("jumped", entry.getKey());
		}
	}
    
	@Test
	//Test Case for Verifying the length of longest word
	public void test2() {
		FindLongestWord ob = new FindLongestWord();
		Map<String, Integer> testMap = new LinkedHashMap<String, Integer>();
		testMap = ob.findLongestWord("The cow jumped over the cliff");
		for(Map.Entry<String, Integer> entry: testMap.entrySet()){
		assertEquals(6, entry.getValue().intValue());
		}
	}
	@Test
	//Test Case for verifying if the input string is empty
	public void test3() {
		FindLongestWord ob = new FindLongestWord();
		Map<String, Integer> testMap = new LinkedHashMap<String, Integer>();
		testMap = ob.findLongestWord("");
		for(Map.Entry<String, Integer> entry: testMap.entrySet()){
		assertEquals(null, entry.getKey());
		}
	}
	@Test
	//Test Case for Verifying the length of longest word if it is empty string
	public void test4() {
		FindLongestWord ob = new FindLongestWord();
		Map<String, Integer> testMap = new LinkedHashMap<String, Integer>();
		testMap = ob.findLongestWord("");
		for(Map.Entry<String, Integer> entry: testMap.entrySet()){
		assertEquals(0, entry.getValue().intValue());
		}
	}
	@Test
	//Test Case for Verifying the String with only whitespace
	public void test5() {
		FindLongestWord ob = new FindLongestWord();
		Map<String, Integer> testMap = new LinkedHashMap<String, Integer>();
		testMap = ob.findLongestWord(" ");
		for(Map.Entry<String, Integer> entry: testMap.entrySet()){
		assertEquals(null, entry.getKey());
		}
	}
	@Test
	//Test Case for verifying the longest word in the sentence, if there are two or more words with same length then it will return the word whose occurrence comes first in the sentence.
	public void test6() {
		FindLongestWord ob = new FindLongestWord();
		Map<String, Integer> testMap = new LinkedHashMap<String, Integer>();
		testMap = ob.findLongestWord("The cow jumps over the fence");
		for(Map.Entry<String, Integer> entry: testMap.entrySet()){
		assertEquals("jumps", entry.getKey());  // Both "jumps" and "fence" have same length but since "jumps" occur first it is returned.
		}
	}
	@Test
	//Test Case for verifying the longest word in the sentence, where it is assumed that the sentence is only space delimited, other delimiters are not considered for the scope.
	public void test7() {
		FindLongestWord ob = new FindLongestWord();
		Map<String, Integer> testMap = new LinkedHashMap<String, Integer>();
		testMap = ob.findLongestWord("The cow jumps, and goes over the fence.");
		for(Map.Entry<String, Integer> entry: testMap.entrySet()){
		assertNotSame("jumps", entry.getKey());  // Comma delimiter is not considered in the scope hence expected and actual value won't be same.
		}
	}
	@Test
	//Test Case for verifying alphanumeric characters as part of the sentence, 
	public void test8() {
		FindLongestWord ob = new FindLongestWord();
		Map<String, Integer> testMap = new LinkedHashMap<String, Integer>();
		testMap = ob.findLongestWord("Emp ID 123abc");
		for(Map.Entry<String, Integer> entry: testMap.entrySet()){
		assertEquals("123abc", entry.getKey());  // Alphanumeric characters are accepted as part of input string
		}
	}
}
