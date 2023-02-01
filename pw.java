import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class pw{

 public static void main(String[] args) {
// System.out.println(args[0] +" "+args[1]);
//     m1();
practice();
// charOccur("JayantKumar");
// vencksSeq(100);
}

public static void m1(){
// System.out.println("Ile");
int i = 0;
do {
    System.out.println(i);
    i++;
} 
while (i<6);
// code
}

public static void charOccur(String str){
    char[] charArr = str.toLowerCase().toCharArray();
    int len = charArr.length;
    Map<Character, Integer> countMap = new LinkedHashMap<>();
    for (int i =0; i<len; i++){
        if(countMap.containsKey(charArr[i])){
            countMap.put(charArr[i], countMap.get(charArr[i])+1);
        }
        else{
            countMap.put(charArr[i], 1);
        }

    }
    countMap.forEach((k, v)->{
        System.out.println(k+ " "+v);
    });
} 

public static void vencksSeq(int range){

    int newNum,  lastIndex;
    newNum=lastIndex=0;
    Map<Integer, Integer>  numMap = new HashMap<>();
    System.out.print(newNum);
    for(int currInd =1; currInd<=range ;currInd++){
        if(numMap.containsKey(newNum)){
            lastIndex = numMap.get(newNum);
            numMap.put(newNum, currInd);
        }
        else{
            numMap.put(newNum, currInd);
            lastIndex=currInd;
        }
        
        newNum = currInd - lastIndex;
        System.out.print(", "+newNum);

    }

}

public static void practice(){
    int res, a, d, b, c ;
    a=b=10;
    c=20;
    d=30;
    res = a<b?(b>c?(b>d?b:d):c):(a>c?(a>d?a:d): (c>d?c:d));

    // boolean res = a==b;

    System.out.println(res);
}

public void m2(){
System.out.println("Ne fIle");
// code
}

public void m3(){
System.out.println("New fIle");
// code
}
}