// class Solution {
//     public int carFleet(int target, int[] position, int[] speed) {
//         int prev=0;
//         float res=Float.MAX_VALUE;
//         Stack<Float> s=new Stack<>();
//         int f=0;
        
//         for(int i=0;i<position.length;i++){
//             res=(float) (target-position[i])/speed[i];

//             if(prev>position[i]){
//                 if(res>s.peek()){
//                     f++;
//                 }
//             }else{
//                 f++;
//             }

//             s.push(res);
//             prev=position[i];
//         }

//         return f;
//     }
// }

import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(a[0], b[0]));

        Stack<Double> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            double time = (double) (target - cars[i][0]) / cars[i][1];

            if (s.isEmpty() || time > s.peek()) {
                s.push(time);
            }
        }

        return s.size();
    }
}