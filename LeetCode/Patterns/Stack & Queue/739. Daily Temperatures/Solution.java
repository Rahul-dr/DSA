class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() &&
                   temperatures[i] > temperatures[s.peek()]) {

                int prev = s.pop();
                res[prev] = i - prev;
            }

            s.push(i);
        }

        return res;
    }
}