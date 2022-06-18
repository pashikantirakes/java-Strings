package in.Strings.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceChar {

	public static void main(String[] args) {
  String input="hheelllloooo";
  char[] ch=input.toCharArray();
   Map<Character,Integer> m=new HashMap<>();
    for(char c : ch) {
    	if(!m.containsKey(c)) {
    		m.put(c, 1);
    	}else {
    		int cnt=m.get(c);
    		m.put(c,cnt+1);
    	}
    }
    //System.out.println(m);
    Set<Entry<Character, Integer>> s=m.entrySet();
    for(Entry<Character,Integer> f : s) {
    	System.out.println( f.getKey() + " -Comes  " +f.getValue() + " times" );
    }
	}

}
