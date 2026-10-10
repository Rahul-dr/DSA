class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();

        int res=Integer.parseInt(tokens[0]);
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int n2=s.pop();
                int n1=s.pop();

                if(tokens[i].equals("+")){
                    res=n1+n2;
                }else if(tokens[i].equals("-")){
                    res=n1-n2;
                }else if(tokens[i].equals("*")){
                    res=n1*n2;
                }else{
                    res=n1/n2;
                }
                
                s.push(res);
            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }

        return res;
        
    }
}