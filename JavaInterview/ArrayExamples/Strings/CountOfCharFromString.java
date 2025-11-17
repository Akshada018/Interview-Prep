package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabcaaccc";
//		
//		Map<Character, Integer> map = new HashMap<>();
//		
//		for(Character ch : s.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0)+1);
//		}
//		
//		System.out.println(map);
		//output --> consecutive (group-wise) character counts --> a=2, b=1, c=1, a=2, c=3

		// Using for loop on 
//		int count = 1;

//		for (int i = 1; i < s.length(); i++) {
//			if (s.charAt(i) == s.charAt(i - 1)) {
//				count++;
//			} else {
////				System.out.println(s.charAt(i-1)+"="+count);
//				count = 1;
//			}
//		}
		
//		System.out.print(s.charAt(s.length() - 1) + "=" + count);
		
		// Using for loop with String builder
		
		
		int count = 1;

		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i - 1)) {
				count++;
			}else {
				sb.append(s.charAt(i - 1)).append("=").append(count).append(",");
				count = 1;
			}
		}

		sb.append(s.charAt(s.length() - 1)).append("=").append(count);
		
		System.out.println(sb.toString());
	}

}
