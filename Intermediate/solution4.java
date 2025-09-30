package Intermediate;

import java.util.ArrayList;
import java.util.List;

import miscelleous1.soulution17;

public class solution4 {
    public void generator(int n){
        List<String> result = new ArrayList<>();
        generatorHelper(n, "", result);
        for(String s : result){
            System.out.print(s + " ");
        }
    }

    public void generatorHelper(int n , String current , List<String> result){
        if(current.length() == n){
            result.add(current);
            return;
        }

        generatorHelper(n, current + "0", result);

        System.out.println(current);

        if(current.isEmpty() || current.charAt(current.length()-1) != '1'){
            generatorHelper(n, current + "1", result);
            System.out.println(current);
        }
    }
    public static void main(String[] args) {
        solution4 sol = new solution4();
        sol.generator(2);

    }
}
