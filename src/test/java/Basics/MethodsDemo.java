package Basics;

public class MethodsDemo {

 public static void main(String[] args) {
  MethodsDemo2 pp = new MethodsDemo2();
  String name2 = pp.getUserData();

  String name = getData();
  System.out.println(name + " " + "I am using static access modifier");
  System.out.println(name2);
 ;
 }
 public static String getData(){
 // System.out.println("Hello world");
  return "rahul shetty";
 }
 }
