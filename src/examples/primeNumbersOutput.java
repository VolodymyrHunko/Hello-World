package examples;

import java.util.ArrayList;

public class primeNumbersOutput {

    public static void main(String[] args) {
        primeNumbers();
    }

    public static void primeNumbers( ) {
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i=2; i<=100; i++) {
            for(int a=2; a<i; a++) {
                if(i%a == 0) {
                    prime.clear();
                    break;
                }
                prime.add(i);
            }
            if(prime.size()>0) {
                System.out.println(prime.get(0));
                prime.clear();
            }
        }
    }

}
