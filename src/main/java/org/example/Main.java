package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tmp = Integer.parseInt(bf.readLine());
        int[] A = new int[500000];
        int i = tmp / 2;
        bw.write(1 + "\n");
        bw.write(A[i] + "");
        bw.flush();
    }
}