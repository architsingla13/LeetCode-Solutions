package String;

/**
 * Author - archit.s
 * Date - 20/08/18
 * Time - 12:59 PM
 */
public class Shortest {

//  Solution 1
//  public int[] shortestToChar(String S, char C) {
//        List<Integer> l = new LinkedList<>();
//        int[] result = new int[S.length()];
//
//        for(int i=0; i<S.length(); i++){
//            if(S.charAt(i) == C){
//                l.add(i);
//            }
//        }
//
//        for(int i=0; i<S.length(); i++){
//            if(S.charAt(i) == C){
//                result[i] = 0;
//            }
//            else{
//                int min = Integer.MAX_VALUE;
//                for(int j=0; j<l.size(); j++){
//                    int temp = Math.abs(l.get(j)-i);
//                    if( temp < min){
//                        min = temp;
//                    }
//                }
//                result[i] = min;
//            }
//        }
//
//        return result;
//    }

    public int[] shortestToChar(String S, char C) {

        int[] result = new int[S.length()];
        int prev = Integer.MIN_VALUE / 2;

        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == C){
                prev = i;
            }
            result[i] = Math.abs(prev - i);
        }

        prev = Integer.MIN_VALUE / 2;

        for(int i=S.length()-1; i>=0; i--){
            if(S.charAt(i) == C){
                prev = i;
            }
            result[i] = Math.min(Math.abs(prev - i), result[i]);
        }

        return result;
    }


}
