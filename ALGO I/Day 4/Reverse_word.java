class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
	   String finalresult="";
	   for(int i=0;i<str.length;i++){
	   	String result="";
	   	for(int j=0;j<str[i].length();j++){
	   		result+=str[i].charAt(str[i].length()-j-1);
	   	}
	   	result+=" ";
	   	finalresult+=result;
	   }
        return finalresult.trim();
    }
}