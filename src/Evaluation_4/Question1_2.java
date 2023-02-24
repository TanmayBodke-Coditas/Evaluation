package Evaluation_4;

class VowelsAndConsonents{
    String input = "i am tanmay, i am from java team";
    public void countAndPrintVowels(){
        int  vowels = 0;
        String result = "";

        for(int i = 0 ; i<input.length(); i++){
            char c  = input.charAt(i);
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels++;
                result = result + c;
            }
        }
        System.out.println("Number of vowels present :: " + vowels);
        System.out.println("Vowels String :: " + result);
    }


}
public class Question1_2 {
    public static void main(String[] args) {
        VowelsAndConsonents vowelsAndConsonents = new VowelsAndConsonents();
        vowelsAndConsonents.countAndPrintVowels();
    }


}
