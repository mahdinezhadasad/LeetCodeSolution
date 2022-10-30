import java.util.*;


public class donotRepeatSome {

    public static void main(String[] args) {

       // removeDuplicateLetters("asadfcebb");
        removeDuplicatedLetterWithStackMethod("asts");

        System.out.println("Enter The String : ");
        String str = "geeksforgeeks";
        StringBuffer sb = new StringBuffer();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        String DuplicateString = sb.toString();
        System.out.println("String after duplicates removed :"+DuplicateString);



    }

    public static String removeSomething(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {

            lastIndex[s.charAt(i) - 'a'] = i;
        }
        boolean[] seen = new boolean[26];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (seen[curr]) {

                continue;
            }
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]) {

                seen[st.pop()] = false;
            }

            st.push(curr);
            seen[curr] = true;


        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {

            char e = (char) (st.pop() + 'a');
            sb.append(e);
        }
        return sb.reverse().toString();
    }

    public static String removeDuplicatedLetterWithStackMethod(String s){

        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {

            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<s.length();i++){
            int curr = s.charAt(i) -'a';
            if(seen[curr]){

                continue;
            }


            while(!st.isEmpty()&& st.peek()> curr&& i < lastIndex[st.peek()]){


                seen[st.pop()] = false;
            }
            st.push(curr);
            seen[curr]=true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){

            sb.append((char) (st.pop() +'a'));
        }
        return sb.reverse().toString();


    }

    public static String setString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            stringList.add(String.valueOf(s.charAt(i)));
            for (int b = 0; b < stringList.size(); b++) {
                for (int j = 1; j < stringList.size(); j++) {

                    if (!Objects.equals(stringList.get(b), stringList.get(j))) {

                        stringBuilder.append(b);
                    }
                }
            }

        }
        System.out.println(stringBuilder);
        return String.valueOf(stringBuilder);
    }

    public static String removeDuplicateLetters(String s) {
        final int N = 26;
        int[] count = new int[N];
        boolean[] inQueue = new boolean[N];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            int idx = (int)(s.charAt(i) - 'a');
            count[idx]--;
            if (inQueue[idx]) {
                continue;
            }
            while (!dq.isEmpty() && dq.peekLast() > idx && count[dq.peekLast()] > 0) {
                inQueue[dq.pollLast()] = false;
            }
            inQueue[idx] = true;
            dq.offerLast(idx);
        }
        StringBuilder sb = new StringBuilder();
        while (!dq.isEmpty()) {
            sb.append((char)(dq.pollFirst() + 'a'));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static String removeDuplicateLetters1(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            if (cnt[i] < 0) {
                cnt[i]++;
                continue;
            }
            while (!st.isEmpty()) {
                if (i < st.peek() && cnt[st.peek()] * -1 > 1) {
                    int v = st.pop();
                    cnt[v] *= -1;
                    cnt[v]--;
                } else {
                    break;
                }
            }
            cnt[i] *= -1;
            st.push(i);
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append((char)(st.pop() + 'a'));
        }
        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();
    }
}
