package org.example;

import java.util.HashMap;
import java.util.Map;

public class RepeatedSubsequence {

    public boolean isRepeatedSubsequence(String str){
        final int DECIMAL = 10;

        if(str.length()==0)
            return false;

        Map<String, String> subsequenceMap = new HashMap<>();
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                String currentSubsequence = str.charAt(i)+""+str.charAt(j);
                String indexPair = String.valueOf(i).concat(String.valueOf(j));
                if(subsequenceMap.containsKey(currentSubsequence)){
                    if(subsequenceMap.get(currentSubsequence).charAt(0)!=Character.forDigit(i,DECIMAL) && subsequenceMap.get(currentSubsequence).charAt(1)!=Character.forDigit(j, DECIMAL))
                        return true;
                } else {
                    subsequenceMap.putIfAbsent(currentSubsequence,indexPair);
                }
            }
        }
        return false;
    }
}
