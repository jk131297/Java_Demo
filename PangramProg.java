import java.util.Scanner;

public class PangramProg {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string to check");
        String inputStr = scn.nextLine();
        if(checkForPanagram(inputStr)){
            System.out.println("This is an Panagram");
        }
        else{
            System.out.println("This is not an Panagram");
        }
        scn.close();

    }

    public static boolean checkForPanagram(String sentence){
        String senInUpperCase = inUpperCase(sentence);
        char[] charArr = senInUpperCase.toCharArray();
        int len = charArr.length;
        boolean mark;
        for(int i = 65 ; i<=90 ; i++){
            mark = false;
            for(int j =0; j<len;j++){
                if(charArr[j]==i){
                    mark =true;
                    break;
                }
            }

            if(!mark){
                return false;
            }
        }
        return true;

    }

    public static String inUpperCase(String sen){
        String senWithoutWhiteSpace = removeWhiteSpace(sen);
        char[] toCharArr = senWithoutWhiteSpace.toCharArray();
        int len = toCharArr.length;
        int ascii;
        for(int i=0; i<len;i++){
            ascii = toCharArr[i];
            if(ascii>=97 && ascii<=122){
                toCharArr[i]= (char)(ascii-32);
            }
        }
        return new String(toCharArr);
    }

    public static String removeWhiteSpace(String sen){
        String newSenWithoutSpace = "";

        int len = sen.length();

        for (int i =0; i<len ; i++){
            if(sen.charAt(i)!=' '){
                newSenWithoutSpace+=sen.charAt(i);
            }
        }
        return newSenWithoutSpace;
    }
}
