package com.cg.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
//		boolean result=isValidPhoneNumber("9826515700");
//		System.out.println("This number is "+result);
		
//		System.out.println(isValidEmail("riya-233@gmail-google.in"));
		
//		System.out.println(containsOnlyDigits("2564893664562748857646627839957566384957"));
		
//		System.out.println(containsOnlyLetters("theyxbhdhhhhheee"));
		
//		System.out.println(replaceWhitespace("I am     464        from     India123"));
		
		System.out.println(isValidURL("https://gamingportal.com"));
		
		System.out.println(isValidHexColor("#D46E36"));
		
		System.out.println(isValidCreditCard("1222638563956285"));
		
		System.out.println(isValidDate("1200-02-00"));
		
		System.out.println(isValidZip("200183"));
		
		System.out.println(isValidPassword("sg@#123FEDEX"));
		
		System.out.println(countWords("Thiss is me"));
		
		System.out.println(containsSpecialCharacters("sbc25ggg"));
		
		System.out.println(removeAlphaNumeric("thisis@#$name"));
		System.out.println(validTime("23:26"));
		
		System.out.println(checkVowel("sdddsaeidnb"));
		
		System.out.println(checkConsonant("aebcdiou"));
		
		System.out.println(countVowels("hello rohan my age is 23 year of birth is 2012 and 2011"));
		
		System.out.println(extractHashtags("dff#h##d"));
		
		System.out.println(extractLowercaseLetters("my Name is Riya"));
		
		System.out.println(validFileExtension("ab23c.pdf"));
		
		System.out.println(extractLinesStartingWith("doctor is good\ndmart is close by\ngarden is beautiful", 'd'));
		
		System.out.println(extractSentences("doctosr are here? this is my house. you are amazing."));
		
		System.out.println(extractWordsOfLength("hey your home now run to ground say", 3));
		
		System.out.println(extractWordIgnoringCase("your cat is cating very cat way so cat catying", "cat"));
		
		System.out.println(extractNumbers("hey riyaa you273 are jus2.836 so cute"));
	}

	public static boolean isValidPhoneNumber(String phone) {
		
		String regex="^\\d{10}$";
		
		return Pattern.matches(regex, phone);
		
	}
	
	public static boolean isValidEmail(String email) {
        String regex = "^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,4}$";
        return Pattern.matches(regex, email);
    }
	
	 public static boolean containsOnlyDigits(String str) {
	        String regex = "^\\d+$";
	        return Pattern.matches(regex, str);
	    }
	 
	 public static boolean containsOnlyLetters(String str) {
	        String regex = "^[a-zA-Z]+$";
	        return Pattern.matches(regex, str);
}
	 
	 
	 public static boolean isValidIPv4(String ip) {
	        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
	        return Pattern.matches(regex, ip);
	    }
	 
	   public static String replaceWhitespace(String str) {
	        return str.replaceAll("\\s+", " ");
	    }
	   
	   public static boolean isValidURL(String url) {
	        String regex = "^(http|https)://.*$";
	        return Pattern.matches(regex, url);
	    }
	   
	   public static boolean isValidHexColor(String color) {
	        String regex = "^#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})$"; //Example: #FFFFFF (White), #A1B2C3 (a shade of blue). //Example: #FFF (White), #A1B (a shorter version of a color code).
	        return Pattern.matches(regex, color);
	    }
	   
	   
	   public static List<String> extractEmail(String text){
		   String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);
	        List<String> emails = new ArrayList<>();
	        while (matcher.find()) {
	            emails.add(matcher.group());
	        }
	        return emails;
	    }
	   
	   
	   public static boolean isValidCreditCard(String credit) {
		   String regex="^\\d{16}$";
		return Pattern.matches(regex, credit);
		   
	   }
	   
	   public static boolean isValidDate(String date) {
		   String regex="^((1|2)[0-9]{3})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";
		   return Pattern.matches(regex, date);
	   }
	   
	   public static boolean isValidZip(String zip) {
		   String regex="^\\d{6}$";
			return Pattern.matches(regex, zip);
			   
	   }
	   
	   public static boolean isValidPassword(String psw) {
		   String regex="^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[\\W_]).{8,}$";
		   return Pattern.matches(regex, psw);
	   }
	   
	   public static int countWords(String str) {
	        String regex = "\\b\\w+\\b";
	        return str.split(regex).length;
	    }
	   
	   public static boolean containsSpecialCharacters(String str) {
	        String regex = ".*[^a-zA-Z0-9].*";
	        return Pattern.matches(regex, str);
	    }
	   public static String removeAlphaNumeric(String str) {
		   return str.replaceAll("[^a-zA-Z0-9]", "");
	   }
	   
	   public static boolean validTime(String time) {
		   String regex="^((0|1)[0-9]|2[0-3]):([0-5][0-9])$";
		   return Pattern.matches(regex, time);
	   }
	   
	   public static boolean checkVowel(String v) {
		   String regex="[aeiouAEIOU]";
		   return Pattern.matches(regex, v);
	   }
	   public static boolean checkConsonant(String c) {
		   String regex="^.*[^a|e|i|o|u].*$";
		   return Pattern.matches(regex, c);
	   }
	   
	   public static int countVowels(String str) {
	        String regex = ".*[aeiou].*";
//	        String regex = "[^aeiouAEIOU]";
	        //[^aeiouAEIOU]: The [^...] syntax means "any character except those listed inside the brackets."
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(str);
	        int count = 0;
	        while (matcher.find()) {
	            count++;
	        }
	        return count;
	   }
	   
	   public static  List<String> extractHashtags(String hashtag){
		   String regex="#";
		   Pattern pattern=Pattern.compile(regex);
		   Matcher matcher=pattern.matcher(hashtag);
		   List <String> hashtags=new ArrayList<>();
		   while(matcher.find()) {
			   hashtags.add(matcher.group());
			   
		   }return hashtags;
	   }
	   
	   public static List<String> extractLowercaseLetters(String str) {
	        String regex = "[a-z]+";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(str);
	        List<String> letters = new ArrayList<>();
	        while (matcher.find()) {
	            letters.add(matcher.group());
	        }
	        return letters;
	    }
	   
	   public static boolean validFileExtension(String file) {
		   String regex="^\\w+\\.(txt|doc|png|pdf)$";
		   return Pattern.matches(regex, file);
	   }
	   
	   public static List<String> extractLinesStartingWith(String text, char character) {
	        String regex = "^[character].*$";
	        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
	        Matcher matcher = pattern.matcher(text);
	        List<String> lines = new ArrayList<>();
	        while (matcher.find()) {
	            lines.add(matcher.group());
	        }
	        return lines;
	    }

	   public static List<String> extractSentences(String text) {
	        String regex = "[\\.|\\!|\\?]$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);
	        List<String> sentences = new ArrayList<>();
	        while (matcher.find()) {
	            sentences.add(matcher.group().trim());
	        }
	        return sentences;
	    }
	   
	   
	   public static List<String> extractWordsOfLength(String s, int length){
		   String regex="\\b\\w{" + length + "}\\b";
		   Pattern pt=Pattern.compile(regex);
		   Matcher mt=pt.matcher(s);
		   List<String> sentence=new ArrayList<>();
		   while(mt.find()) {
			   sentence.add(mt.group());
		   }
		   return sentence;
	   }
	   
	   public static List<String> extractWordIgnoringCase(String str, String word) {
	       String regex = "(?i)\\b" + Pattern.quote(word) + "\\b";
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(str);
	       List<String> occurrences = new ArrayList<>();
	       while (matcher.find()) {
	           occurrences.add(matcher.group());
	       }
	       return occurrences;
	   }
	   
	   public static List<String> extractNumbers(String str) {
	       String regex = "\\d+(\\.\\d+)?";
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(str);
	       List<String> numbers = new ArrayList<>();
	       while (matcher.find()) {
	           numbers.add(matcher.group());
	       }
	       return numbers;
	   }
}
