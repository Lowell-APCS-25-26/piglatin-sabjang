package org.APCSLowell;


public class PigLatin {
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
        for(int i = 0; i<sWord.length(); i++){
            String check = sWord.substring(i, i+1);
            if(check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u"))
                return i;
        }
        return -1;
    }


    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        if(findFirstVowel(sWord)!=-1){
            if(findFirstVowel(sWord)==0) //begins with vowel
                return sWord+"way";
            else if(sWord.substring(0, 2).equals("qu")) //begins with qu
                return sWord.substring(2)+"quay";
            else{ //begins with consonants
                return sWord.substring(findFirstVowel(sWord))+sWord.substring(0, findFirstVowel(sWord))+"ay";
            }
        }
        else //doesn't contain any vowels
            return sWord+"ay";
    }
}



