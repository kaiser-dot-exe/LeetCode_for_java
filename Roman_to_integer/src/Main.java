import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

class Solution {
    public int romanToInt(String s) {
        public static void main(String[] args) {

            Dictionary<String, Integer> s = new Hashtable<>();

            s.put("I", 1);
            s.put("V", 5);
            s.put("X", 10);
            s.put("L", 50);
            s.put("C", 100);
            s.put("D", 500);
            s.put("M", 100);


            int total =0;

            for (int i=0 ;i<=s.size()-1;i++){
                total-= s[i];
            }
            else {
                total+= s[i];
            }

            return total + s[i];








        }


    }
















}



