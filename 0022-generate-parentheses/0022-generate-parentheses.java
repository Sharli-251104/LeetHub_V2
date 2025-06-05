class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<String>();
        backtrack(n,0,0,"",l);
        return l;
    }
    public void backtrack(int n, int open, int close, String s, List<String> l){ 
        if(close==n){
            l.add(s);
            return;
        }
        if(open < n)
            backtrack(n,open+1,close,s+"(",l);
        if(close < open)
            backtrack(n,open,close+1,s+")",l);
    }
}