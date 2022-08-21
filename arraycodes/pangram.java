public class pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean check = checkIfPangram(sentence);
        System.out.println(check);
    }
    static boolean checkIfPangram(String sentence){
      String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       for(String letter : alphabet){
        if(!sentence.contains(letter)) {
            return false;
        }
       }
       return true;
    }
}
