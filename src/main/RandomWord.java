package main;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.List;

public class RandomWord {
    public static void main(String[] args) {
        List<String> strList= new ArrayList<>();
        while (!StdIn.isEmpty()){
            strList.add(StdIn.readString());
        }
        for (String str: strList) {
            if (StdRandom.bernoulli(strList.size())){
                System.out.println(str);
                return;
            }
        }
    }
}
