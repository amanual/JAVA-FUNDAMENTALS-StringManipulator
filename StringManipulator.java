public class StringManipulator{
    public String trimAndConcat(String str1,String str2){
        String str3 = str1.concat(str2);
        return str3;
    }
    public Integer getIndexOrNull(String word, char ch1){
        int cat = word.indexOf(ch1);
        return cat; 
    }
    public Integer getIndexOrNull(String str3, String str4){
        int newStr = str3.indexOf(str4);
        return newStr;
    }
    public String concatSubstring(String str5, int num1, int num2, String str6){
        String newConcat = str5.substring(num1,num2);
        return newConcat.concat(str6);
    }
}