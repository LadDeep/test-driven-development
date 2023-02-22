package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatedSubsequence {

    public boolean isRepeatedSubsequence(String str){
        final int DECIMAL = 10;

        Map<String, ArrayList<String>> subsequenceMap = new HashMap<>();
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                String currentSubsequence = str.charAt(i)+""+str.charAt(j);
                String indexPair = String.valueOf(i).concat(String.valueOf(j));
                if(subsequenceMap.containsKey(currentSubsequence)){
                    int arrayLength = subsequenceMap.get(currentSubsequence).size();
                    for (int k = 0; k < arrayLength; k++) {
                        if(subsequenceMap.get(currentSubsequence).get(k).charAt(0)!=Character.forDigit(i,DECIMAL) && subsequenceMap.get(currentSubsequence).get(k).charAt(1)!=Character.forDigit(j, DECIMAL) ) {
                            subsequenceMap.get(currentSubsequence).add(indexPair);
                            return true;
                        }
                    }
                } else {
                    ArrayList<String> newIndexPairList = new ArrayList<>();
                    newIndexPairList.add(indexPair);
                    subsequenceMap.put(currentSubsequence, newIndexPairList);
                }
            }
        }
        return false;
    }
}
