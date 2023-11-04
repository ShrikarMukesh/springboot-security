package com.canarabank;

public class Test {
    public static void main(String[] args) {
        int test = getMarks("one");
        System.out.println(test);
    }
    public static int getMarks(String request){

        if(request.equalsIgnoreCase("one")){
            try{
                int i = 9/0;
                return 9;
            }catch (ArithmeticException arithmeticException){
                return 60;
            }
            finally {
                return 89;
            }
        }
        else {
            return 9;
        }
    }
}
