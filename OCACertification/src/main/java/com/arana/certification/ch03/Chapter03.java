package com.arana.certification.ch03;

public class Chapter03 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        System.out.println(sub + " " + sb.length() + " " + sb.charAt(6));
    }
}
