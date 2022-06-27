package doit_coding_test_java.ch3_data_structure.array_and_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 숫자의 합 구하기
 * 백준 11720번
 */
public class P11720_숫자의합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String sNum = br.readLine();

        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (char c : cNum) {
            sum += (c - '0');
        }
        System.out.println(sum);
    }
}