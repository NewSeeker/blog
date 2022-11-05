package demo;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1 {
    public static void main(String[] args) {
        String[] str1 = In.readStrings(args[0]);
        for (String s : str1) {
            System.out.println(s);
        }
        while (!StdIn.isEmpty()) {
            String[] str2 = StdIn.readStrings();
            for (String s : str2) {
                System.out.println(s);
            }
        }

    }
}
