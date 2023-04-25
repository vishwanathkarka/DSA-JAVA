package leetcode;

public class FindGreatestElement {
    public static void main(String[] args) {
//        char arr = new char[] {"e","e","e","e","e","e","n","n","n","n"};
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int l =0;
        int h = letters.length;
        int tar = (int) target;
        int mid = 0;
        while(l<h){
            mid = (l+h)/2;
            if((int) letters[0] > tar){
                mid = 0;
                break;
            }
            if((int) letters[mid]> tar && (int)letters[mid-1] <tar){
                break;
            }
            else if((int)letters[mid]< tar){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        if((int) letters[mid] <= tar){
            return letters[0];
        }

        return letters[mid];
    }
}
