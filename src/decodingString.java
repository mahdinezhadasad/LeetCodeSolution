import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.Character.isDigit;

public class decodingString {

    public static void main(String[] args) {

        decodeString1("2[abc]3[cd]ef");

    }

    public static String decodeString2(String s){
        if(s.length()==0){
            return "";
        }
        int number =0;
        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length();i++){

            char c = s.charAt(i);
            if(isDigit(s.charAt(i))){

                number = number*10 +c -'a';
            } else if (c=='[') {
                String str = "";
                stack.push(number+"");
                stack.push("[");
                number =0;

            } else if (c==']') {
                StringBuilder str = new StringBuilder();
                while(stack.peek()!="["){

                    str.insert(0, stack.pop());
                }
                stack.pop();
                int repeat = Integer.parseInt(stack.pop());
                StringBuilder sb = new StringBuilder();
                for(int k=0; k<repeat;k++){
                    sb.append(str);
                }
                stack.push(sb.toString());


            }
            else {
                stack.push(c+"");
            }

        }

        String stringBuilder ="";
        while(!stack.isEmpty()){

            stringBuilder = stringBuilder + stack.pop();

        }
        System.out.println(stringBuilder);
        return stringBuilder;
    }
    public static String decodeString1(String s) {
        if(s.length()==0) return "";
        Stack<String> st = new Stack<>();
        int num = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c>='0'&&c<='9')
                num = num*10 + c-'0';
            else if(c=='[')
            {
                st.push(num + "");
                st.push("["); //use [ as a marker so we don't have to check whether an item is a number or not
                num = 0;
            }else if(c==']')
            {
                String str = "";
                //keep pop until meet '['
                while(st.peek()!="[")
                {
                    str = st.pop() + str;
                }
                st.pop(); //pop '['
                int repeat = Integer.parseInt(st.pop());
                StringBuilder sb = new StringBuilder();
                for(int k=0; k<repeat; k++)
                {
                    sb.append(str);
                }
                st.push(sb.toString());
            }else
                st.push(c+"");
        }

        String ans = "";
        while(!st.isEmpty()) ans = st.pop() + ans;
        System.out.println(ans);
        return ans;
    }
}
