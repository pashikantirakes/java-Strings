package in.Strings.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedChar {
	public static void main(String[] args) {
		Integer arr[]= {2,3,4,5,4,3};
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(s.contains(arr[i] )) {
				System.out.println(arr[i]);
			}else {
				s.add(arr[i]);
			}
		}
		System.out.println("..........................");
		Map<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i],m.get(arr[i])+1);
			}else {
				m.put(arr[i],1);
			}
		}
		m.forEach((k,v)->System.out.println(" Kwy is " + k + " Value is " + v));
}
}