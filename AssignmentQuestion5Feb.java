public class AssignmentQuestion5Feb {
    
    public static void main(String[] args){
        // checkPalindrome("2552");
        // printMaxOccurChars("Hello, My Name is Jayant");
        // checkAnagram("RACE peek","care kiep");
        checkForUniqueChar("Hello My Name is Jayant");
        checkPangram("The quick brown fox jumps over the lazy dog");
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

    public static void checkPangram(String inputStr){

        inputStr=inputStr.toUpperCase().replace(" ", "");
        char charArr[] = inputStr.toCharArray();
        int intArr[] = new int[26];
        boolean isPanagram = true;
        for(int i =0; i < charArr.length; i++){
            intArr[charArr[i]-65]++;
        }

        for(int j =0; j<26;j++){
            if(intArr[j]==0){
                isPanagram=false;
                break;
            }
        }
        if(isPanagram){
            System.out.println("This is Pangram");
        }
        else{
            System.out.println("This is not a Pangram");     
        }

    }

    /*Q6 -- write a prog to check Pangram */

    public static void checkAnagram(String inputStr, String secString){
        inputStr=inputStr.toUpperCase().replace(" ", "");
        secString = secString.toUpperCase().replace(" ","");
        char inputStrAr[] = inputStr.toCharArray();
        char secStringArr[] = secString.toCharArray();
        boolean isAnagram=true;
        inputStrAr = sortArr(inputStrAr);
        secStringArr = sortArr(secStringArr);
        int lenofInputStrArr = inputStrAr.length;
        int lenOfsecStringArr = secStringArr.length;
        if(lenOfsecStringArr!=lenofInputStrArr){
            System.out.print("Not Anagram");
        }
        else{

            for(int i=0;i<lenofInputStrArr;i++){
                if(inputStrAr[i]!=secStringArr[i]){
                    isAnagram=false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println("This is Anagram");
            }
            else{
                System.out.print("Not Anagram");
            }
        }
        
    }

    public static char[] sortArr(char[] charArr){
        char c='0';
        for(int i=0;i<charArr.length;i++){
            for(int j=0; j<charArr.length-1-i;j++){
                if(charArr[j]>charArr[j+1]){
                    c=charArr[j+1];
                    charArr[j+1]=charArr[j];
                    charArr[j]=c;
                }
            }
        }
        return charArr;
    }
    
    /* Q7 -- write a prog to check unique characters */

    public static void checkForUniqueChar(String inputStr){
        char[] charArr = inputStr.toCharArray();
        int len = charArr.length;
        int[] frequency = new int[len];
        for(int i =0; i<len ; i++){
            frequency[i]=1;
            for(int j=i+1; j<len ; j++){
                if(Character.toString(charArr[i]).equalsIgnoreCase(
                    Character.toString(charArr[j])
                ) && charArr[i]!=' ' 
                && charArr[i]!='0'){
                    frequency[i]++;
                    charArr[j]='0';
                }
            }
        }
        for(int i =0; i<len;i++){
            if(charArr[i]!='0'&& charArr[i]!=' '){
                if(frequency[i]==1){
                    System.out.println(charArr[i]);
                }
            }
        }
    }

    /*Q8 -- write a prog  to check maximum occurance characters */

    public static void printMaxOccurChars(String inputStr){
        char[] charArr = inputStr.toCharArray();
        int len = charArr.length;
        int max, min;
        char maxChar,minChar;
        int[] occurance = new int[len];
        for(int i =0; i<len;i++){
            occurance[i]=1;
            for(int j = i+1; j<len ;j++){
                if(charArr[i]==charArr[j] && charArr[i]!=' ' && charArr[i]!='0'){
                    occurance[i]++;
                    charArr[j]='0';
                }
            }
        }
        min=max=occurance[0];
        minChar =maxChar = charArr[0];
        for(int i =0; i<len;i++){
            if(charArr[i]!=' '&& charArr[i]!='0'){
                System.out.println(charArr[i]+" "+occurance[i]);
                if(min>occurance[i]){
                    min=occurance[i];
                    minChar=charArr[i];
                }
                if(max<occurance[i]){
                    max= occurance[i];
                    maxChar= charArr[i];
                
            }
        }

    }
System.out.println("Max Occurance :"+ maxChar+ " "+max);

// System.out.println("Min Occurance :"+ minChar+ " "+min);


    }
}
