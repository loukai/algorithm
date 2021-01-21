package main.java.test;
 interface AAction{String work(String name);}

 interface UserService{
     void a(AAction aAction);
 }

 class My_Main{
     public static void main(String[]args){
         UserService userService = (n)-> System.out.println(n);
     }
 }


