import java.util.*;

public class test {

    public static void main(String[] args) {


        System.out.println(generateParenthesis3(1));






    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }

    public static List<String> generateParenthesis2(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, new StringBuilder(), 1, 0, n);
        return ans;
    }

    public boolean is_Interleave(String s1, int i, String s2, int j, String res, String s3)
    {
        if(res.equals(s3) && i == s1.length() && j == s2.length())
            return true;
        boolean ans = false;
        if(i < s1.length())
            ans |= is_Interleave(s1, i + 1, s2, j, res + s1.charAt(i), s3);
        if(j < s2.length())
            ans |= is_Interleave(s1, i, s2, j + 1, res + s2.charAt(j), s3);
        return ans;

    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        return is_Interleave(s1, 0, s2, 0, "", s3);
    }

    public static void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }

        if (open < max) {
            cur.append("(");
            backtrack(ans, cur, open+1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(")");
            backtrack(ans, cur, open, close+1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }

    public static List<String> generateParenthesis3(int n) {
        List<String> combinations = new ArrayList();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public static void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current))
                result.add(new String(current));
        } else {
            current[pos] = '(';
            System.out.println(pos);
            generateAll(current, pos+1, result);
            System.out.println(pos);
            current[pos] = ')';
            generateAll(current, pos+1, result);
            System.out.println(pos);
        }
    }

    public static void generatsomething(char[] current, int pos, List<String> result){
        if(pos== current.length){

            if(testing(current)){

                result.add(new String((current)));
            }
            else{

                current[pos] ='(';
                generatsomething(current,pos+1,result);
                current[pos] =')';
                generatsomething(current,pos+1,result);
            }

        }




    }

   public static boolean testing(char [] current){
        int balance =0;
        for(char c: current){
            if(c=='c') {

                balance++;
            }
            else {

                balance--;
            }
            if(balance<0 ){

                return false;
            }

        }
        return (balance==0);


   }

    public static boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(')
                balance++;

            else{
                balance--;
            }

            if (balance < 0) return false;
        }
        System.out.println("balance " +balance);
        return (balance == 0);
    }
}
