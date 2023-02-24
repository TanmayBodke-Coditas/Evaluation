package Evaluation_4;

class ReplaceLetter{
    String input = "I am Tanmay";
    String result = "";
    public void replaceVowel(){

        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            if(!(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u' ) && c!= ' '){
               c++;
            }
            result = result + c;
        }
        System.out.println("String with replacement :: " + result);
    }
}
public class Question1_3 {
    public static void main(String[] args) {
        ReplaceLetter replaceLetter = new ReplaceLetter();
        replaceLetter.replaceVowel();
    }
}
