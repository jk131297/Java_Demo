public class RemoveConst {
    
    public static void main(String[] args){
        deletConsonants("Hello, hAve a good day");
    }

    
public static void deletConsonants(String sentence){
    String vowels = "aeiou";
    String specialChar ="!@#$%^&*()_+=-`~,";
    String[] strBlocksArr = sentence.split(" ");
    String[] newStrBlock = new String[strBlocksArr.length];
    String word = new String();
    for(int i=0; i<strBlocksArr.length;i++){
        word = strBlocksArr[i];
        char[] charArr = word.toCharArray();
        for(char c :charArr){
            if(!(vowels.contains(Character.toString(c)) ||
            vowels.toUpperCase().contains(Character.toString(c)) || specialChar.contains(Character.toString(c)))){
                word = word.replace(Character.toString(c), "");
            }
        }
        newStrBlock[i]=word;
    }
    String finalSen = String.join(" ", newStrBlock);
    System.out.println(finalSen);

}

}
