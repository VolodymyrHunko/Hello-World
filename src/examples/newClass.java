package examples;

import java.util.ArrayList;
import java.util.Stack;

class newClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(22);
        st.push(1);
        st.push(167);
        st.push(-5);
        solution(st);
    }


    public static void solution(Stack<Integer> s) {
        System.out.println(s);
        ArrayList<Integer> al = new ArrayList<Integer>(s);
        al.sort(null);
        int low = al.get(0);
        System.out.println("Lowest walue is: "+low);
        //convert Integer
        int one = 01;
        String oneS = Integer.toString(one);
        one = Integer.parseInt(oneS)+1;
        System.out.println(one + "..."+oneS);


    }
}