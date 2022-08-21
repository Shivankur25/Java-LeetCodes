import java.util.ArrayList;

public class MatchingItems {
    public static void main(String[] args) {
        
    }

    public int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue){
        int index = 0 , count = 0; 
        if(ruleKey.equals("color")){
            index = 1 ;
        }else if(ruleKey.equals("name")){
            index = 2;
        }
        for(ArrayList<String> list : items){ // for(int i = 0 ; i<items.size();i++)
            if(list.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
