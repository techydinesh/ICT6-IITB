import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;


public class Solution {


    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();scan.nextLine();
        
        for(int i=0;i<T;i++)
        {
            String s = scan.nextLine();
            int count=0;
            for(int j=0;j<s.length()/2;j++)
                count+=Math.abs(s.charAt(j)-s.charAt(s.length()-1-j));
            System.out.println(count);
        }
    }
}
