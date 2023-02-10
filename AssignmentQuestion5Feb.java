public class AssignmentQuestion5Feb {
    
    public static void main(String[] args){
        // checkPalindrome("2552");
        countConsoVowelSc("Hello, My N@^_ame is Jayant@#$");
    }

    /*Q1 -- Write a prog to remove Duplicates */

    public static void removeDups(String inputStr){
        char[] charArr = inputStr.toCharArray();
        String newStr = "";
        String chaVal = "";
        for(char c : charArr){
            chaVal = Character.toString(c);
            if((!newStr.contains(chaVal)) 
            || chaVal.equals(" ")){

                newStr+=chaVal;

            }
        } 
        System.out.println(newStr);
    }

    /*Q2 -- write a prog to print duplicate characters */

    public static void printDups(String inputStr){
        char[] charArr = inputStr.toCharArray();
        String str ="";
        String dupStr = "";
        String toStrVal ="";
        for(char c: charArr){
            toStrVal= Character.toString(c);
            if((!str.contains(toStrVal)) || toStrVal.equals(" ")){
                str +=toStrVal;
            }
            else if(!dupStr.contains(toStrVal)){
                dupStr +=toStrVal;
            }
        }
        System.out.println(dupStr);
    }

    /*Q3 -- write a prog to check palindrome */

    public static void checkPalindrome(String inputStr){

        String str ="";
        char[] charArr = inputStr.toCharArray();
        int len = charArr.length;
        for(int i =0; i<len ; i++){
            str = str+charArr[len-i-1];
        }
        if(str.equalsIgnoreCase(inputStr)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
    
    /*Q4-- write a prog to count consonants, vowel and special characters */
    
    public static void countConsoVowelSc(String inputStr){
        char[] charArr = inputStr.toCharArray();
        String vowels = "aeiou";
        String specialChar = "~`!@#$%^&*()_+=|][{}';:.,<>?'/''\'";
        int vowelCount =0;
        int consonantsCount = 0;
        int specialCharCount =0;
        int len = charArr.length;
        String charStr ="";
        for(int i =0; i<len ;i++){
            charStr= Character.toString(charArr[i]);
            if(vowels.contains(charStr) || vowels.toUpperCase().contains(charStr)){
                vowelCount++;
            }
            else if(specialChar.contains(charStr)){
                specialCharCount++;
            }
            else if (charStr.equals(" ")){
                continue;
            }
            else{
                consonantsCount++;
            }
        }

        System.out.println("Vowels: "+vowelCount);
        
        System.out.println("Consonanats: "+consonantsCount);
        
        System.out.println("Special Characters: "+specialCharCount);

    }

    /*Q5 -- write a prog to check anagram */

    public static void checkAnagram(String inputStr){

    }

    /*Q6 -- write a prog to check Pangram */

    public static void checkPangram(String inputStr){

    }
    
    /* Q7 -- write a prog to check unique characters */

    public static void checkForUniqueChar(String inputStr){

    }

    /*Q8 -- write a prog  to check maximum occurance characters */

    public static void printMaxOccurChars(String inputStr){


    }





}
