// import java.util.Scanner;

// import javax.swing.plaf.synth.SynthStyle;

// import java.util.Scanner;

// class Main {
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);

//     System.out.println("Enter name, age and salary:");

//     // String input
//     String name = myObj.nextLine();

//     // Numerical input
//     int age = myObj.nextInt();
//     double salary = myObj.nextDouble();

//     // Output input by user
//     System.out.println("Name: " + name);
//     System.out.println("Age: " + age);
//     System.out.println("Salary: " + salary);
//   }
// }

// import java.util.*;
// class Area{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int r=sc.nextInt();
//     double a;
//     a=3.14*r*r;
//     System.out.println("Area of circle is "+a);

//   }
// }

// import java.util.*;
// class Main{
//   public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     int size=sc.nextInt();

//     int[] numbers=new int[size];
//     // input
//     for(int i=0;i<size;i++){
//       numbers[i]=sc.nextInt();
//     }
//     // output
//     for(int i=0;i<size;i++){
//       System.out.println(numbers[i]);
//     }
//   }
// }

// import java.util.*;

// class Main{
//   public static void main(String[] args){
//       Scanner sc=new Scanner(System.in);
//       int size=sc.nextInt();
//       int[] array=new int[size];

//       for(int i=0;i<size;i++){
//         array[i]=sc.nextInt();
//       }
//       System.out.println("Enter the no. whose index you wanna get");
//       int number=sc.nextInt();

//       for(int i=0;i<size;i++){
//         if(number==array[i]){
//           System.out.println("Index is at: " + i );
//         }
//       }
//   }
// }

// import java.util.*;

// class Array{
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int rows=sc.nextInt();
//     int columns=sc.nextInt();
//     int[][] matrix=new int[rows][columns];

//     for(int i=0;i<rows;i++){
//       for(int j=0;j<columns;j++){
//         matrix[i][j]=sc.nextInt();
//       }
//     }
//     for(int i=0;i<rows;i++){
//       for(int j=0;j<columns;j++){
//         System.out.print(matrix[i][j]+" ");
//       }
//       System.out.println();
//     }
//   }
// }

// import java.util.*;
// class TwodArray{
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int rows=sc.nextInt();
//     int columns=sc.nextInt();
//     int[][] matrix=new int[rows][columns];

//     for(int i=0;i<rows;i++){
//       for(int j=0;j<columns;j++){
//         matrix[i][j]=sc.nextInt();
//       }
//     }
//     int x=sc.nextInt();

//     for(int i=0;i<rows;i++){
//       for(int j=0;j<columns;j++){
//         if(matrix[i][j]==x){
//         System.out.print("Indices of no."+ x + " is found at "+ i + ","+ j);
//       }
//     }
//     }
//   }
// }

// import java.util.*;
// class TwodArray{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int rows=sc.nextInt();
//     int columns=sc.nextInt();
//     int[][] matrix=new int[rows][columns];

//     for(int i=0;i<rows;i++){
//       for(int j=0;j<columns;j++){
//         matrix[i][j]=sc.nextInt();
//       }
//     }
    
//     int sum=0;

//     for(int i=0;i<rows;i++){
//       for(int j=0;j<columns;j++){
//         sum=sum+matrix[i][j];
//       }
//     }

//     System.out.println(sum);
//   }
// }


// 2d problem matrix multiplication
// import java.io.*;
// import java.util.*;
// class matrixMulti{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int r1=sc.nextInt();
//         int c1=sc.nextInt();
//         int[][] one=new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//                 one[i][j]=sc.nextInt();
//             }
//         }
//         int r2=sc.nextInt();
//         int c2=sc.nextInt();
//         int[][] two=new int[r2][c2];
//         for(int i=0;i<r2;i++){
//             for(int j=0;j<c2;j++){
//                 two[i][j]=sc.nextInt();
//             }
//         }
        
//         if(c1!=r2){
//             System.out.println("Invalid Matrix");
//             return;
//         }
//         int[][] res=new int[r1][c2];
//         for(int i=0;i<res.length;i++){
//                 for(int j=0;j<res[0].length;j++){
//                     for(int k=0;k<r2;k++){
//                         res[i][j]+=one[i][k]*two[k][j];
//                     }
//                 }
//         }
        
//         for(int i=0;i<res.length;i++){
//             for(int j=0;j<res[0].length;j++){
//                     System.out.print(res[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     }
// }

// import java.util.*;

//   class prime_number{

//   public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);

//        // write ur code here
//        int t=scn.nextInt();
//        for(int i=0;i<t;i++){
//          int n = scn.nextInt();

//        int count=0;
//        for(int div=2;div*div<=n;div++){
//          if(n%div==0){
//            count++;
//            break;
//          }
//        }
//        if (count==0) {
//          System.out.println("prime");
//        } else {
//          System.out.println("not prime");
//        }

//    }
//   }
// }

// import java.util.*;
  
//   class Main{
  
//   public static void main(String[] args) {
//       // write your code here
//       Scanner sc = new Scanner(System.in);
//       int n =sc.nextInt();
//       int a = 0;
//       int b = 1;
//       for(int i=0;i<n;i++){
//         System.out.println(a);
//         int c=a+b;
//         a=b;
//         b=c;
//       }

//    }
//   }

// import java.util.*;
   
//    class Main{
   
//    public static void main(String[] args) {
//      // write your code here  
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      int k = sc.nextInt();
//      int nod=0;
//      int temp=n;
//      while(temp>0){
//        temp=temp/10;
//        nod++;
//      }
//      k=k%nod;
//      if(k<0){
//        k=k+nod;
//      }
//      int multi=1;
//      int div=1;
//      for(int i=1;i<=nod;i++){
//       if (i<=k) {
//        div=div*10;
//       } else {
//        multi=multi*10;
//       }
//      }
//      int q=n/div;
//      int r=n%div;
//      int rotNum=r*multi+q;
//      System.out.println(rotNum);
//     }
//    }

// import java.util.*;
    
//     class Main{
    
//     public static void main(String[] args) {
//       // write your code here  
//       Scanner sc = new Scanner(System.in);
//       int n1=sc.nextInt();
//       int n2=sc.nextInt();
//       int on1=n1;
//       int on2=n2;
//       while(n1%n2!=0){
//         int rem=n1%n2;
//         n1=n2;
//         n2=rem;
//       }
//       int hcf=n2;
//       int lcm=(on1*on2)/hcf;
//       System.out.println("HCF is: "+hcf);
//       System.out.println("LCM is: "+lcm);
//      }
//     }

// import java.util.*;

// class Main {

//     public static void main(String[] args) {
//         // Write your code here
//         System.out.println("*****\n"+"   "+"*\n"+"  "+"*\n"+" "+"*\n"+"*****");

//     }
// }

// import java.util.*;

// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float num = sc.nextInt();
//         float div = sc.nextInt();
//         float x=num/div;
//         System.out.println(x);

//     }
// }

// import java.util.*;

// class Main{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int no=sc.nextInt();
//     System.out.println("Your no. is"+ no);
//   }
// }


// import java.util.*;
// class Main{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i=1;i*i<=n;i++){
//       System.out.println(i);
//     }
//   }
// }

// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i*i<=n;i++){
//             System.out.println(i);
//         }
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
         
//         int nfact=1;
//         for(int i=1;i<=n;i++){
//             nfact=nfact*i;
            
//         }
//         // System.out.println(nfact);
//         int nmr=1;
//         for(int i=1;i<=n-r;i++){
//             nmr=nmr*i;
            
//         }
//         // System.out.println(nmr);
//         int npr=nfact/nmr;
//         System.out.println(npr);

//     }
// }

// import java.util.*;
  
//   public class first{
  
//   public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       int b = scn.nextInt();
//       int dn = getValueInBase(n, b);
//       System.out.println(dn);
//    }
  
//    public static int getValueInBase(int n, int b){
//        // write code here
//        int rem=0;
//        int deg=0;
//        while(n!=0){
           
//            int r=n%b;
//            rem=rem+r*(int)Math.pow(10,deg);
//            n=n/b;
//            deg++;
//        }
//        return rem;
//    }
//   }

// public class first{
//     public static void main(String[] args){
//         System.out.println("main Block");
//     }
//     static{
//         System.out.println("let do");
//     }
//     static{
//         System.out.println("it now");
//     }

// }
// // static block gets executed even before the main method

// public class first{
//     public static void main(String[] args) {

//     //     System.out.println("Inside main");
//         first.method1();

//     }
//     static void method1(){
//         System.out.println("Inside method1");
//     }
//     // static{
//     //     System.out.println("Inside block");
//     //     first.method1();
//     // }
// }

// public class first{

//     int num;
//     // this is how constructors are made
//     first(){
//         System.out.println("Inside the non static method");
//     }
//     public static void main(String[] args) {
//         System.out.println("Inside the main");
//         new first();
//     }
//     {
//         System.out.println("Inside the nonStaticBlock");   
//     }
// }

// class constructors{
//     constructors(){
//         System.out.println("Here goes the constructor44");
//     }
//     {
//         System.out.println("we are in a non static element33");  
//     }
//     public static void main(String[] args){
//         System.out.println("We are in main22");
//         new constructors();
//         new constructors();
//         new constructors();
//         new constructors();
//     }
//     static{
//         System.out.println("we are in static11");
//     }
// }

// class constructors{
//     // Note:Here we are not declaring default constructor
//     // constructors(){
//     //     System.out.println("Here goes the constructor44");
//     // }
//     {
//         System.out.println("we are in a non static element33");  
//     }
//     public static void main(String[] args){
//         System.out.println("We are in main22");
//         new constructors();
//         new constructors();
//         new constructors();
//         new constructors();
//     }
//     static{
//         System.out.println("we are in static11");
//     }
// }
// class constructors{
//     constructors(){
//         System.out.println("Here goes the constructor44");
//     }
//     {
//         System.out.println("we are in a non static element33");  
//     }
//     public static void main(String[] args){
//         System.out.println("We are in main22");
//         new constructors();
//         new constructors();
//         new constructors();
//         new constructors();
//     }
//     static{
//         System.out.println("we are in static11");
//     }
// }

// class newWorld{
//     newWorld(){

//     }
//     static{
//         newWorld Nattu = new newWorld();
//         System.out.println(Nattu);
//     }
//     public static void main(String[] args) {
        
//     }
// }

// class Demo{
//     static{
//         Demo obj=new Demo();
//         System.out.println(obj);
//     }
//     public static void main(String[] args){

//     }
// }

// class Demo{
//     static Demo obj;
//     static{
//         System.out.println(Demo.obj);
//         Demo.obj=new Demo();
//     }
//     public static void main(String[] args){
//         System.out.println(Demo.obj);
//         // Demo.obj=new Demo();
//         // System.out.println(Demo.obj);
//     }
// }

// class Demo{
//     static Demo obj = new Demo();
//     static{
//         System.out.println(Demo.obj);
//         Demo.init();
//     }
//     public static void main(String[] args) {
//         System.out.println(Demo.obj);
//     }
//     static void init(){
//         Demo.obj = new Demo();
//     }
// }

// class Demo{
//     static Demo obj = new Demo();
//     static{
//         System.out.println(Demo.obj);
//         Demo.init();
//     }
//     public static void main(String[] args) {
//         System.out.println(Demo.obj);
//         obj.doSomething();
//         Demo.init();
//     }
//     static void init(){
//         Demo.obj = new Demo();
//         System.out.println("we are inside static method");
//     }
//     void doSomething(){
//         System.out.println("Inside doSomething");
//     }
// }

// Conversion of data from one type to another type is called typeCasting
// There are two types of typeCasting 
// Primitive              Reference
// Implicit(Happens automatically)(when lower datatype is assigned to higher datatype)     
// Explicit(when higher is assigned to lower)

// below is example of implicit typecasting

// public class first{
//     public static void main(String[] args){
//         byte b = 50;
//         int i = b;
//         System.out.println(i);

//         char ch='C';
//         int a = ch;
//         System.out.println(a);

//     }
// }

// Below is the example of explicit typeCasting

// public class first{
//     public static void main(String[] args){
//         int i = 100;
//         byte b = (byte)i;
//         System.out.println(b);

//         int q = 100;
//         char ch = (char)q;
//         System.out.println(ch);
//     }
// }

// explicit typeCasting in action beyond range

// public class first{
//     public static void main(String[] args) {
//         int i = 132;
//         byte b = (byte)i;
//         System.out.println(b);
//     }
// }

// if any field is common across the objects of that class then it is defined as static 
// JVM initializes the instance variables to the default values depending upon their datatype
// local variables(which are initialized within the main method) are present in the stack memory and they are gone once the stack is executed
// static variable will always be there till the class is present over there

// public class first{ 
// public static void main(String[] args){ 
//     int i = 10;
//     float f  =  20.54f;
//     char ch = 'x';
//     String st = "I am the best";
//     System.out.println(i);
//     System.out.println(f);
//     System.out.println(ch);
//     System.out.println(st);
// }
// } 

// It creates stand-alone Spring applications that can be started using Java -jar.
// It tests web applications easily with the help of different Embedded HTTP servers such as Tomcat, Jetty, etc. We don't need to deploy WAR files. 

// public class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         float pi = 3.14f;
//         int area = (int)(pi*r*r) ;
//         System.out.println(area);
//     }
// }

// import java.util.*;
// public class first{
//     public static class node{
//         int data;
//         int next;
//     }
//     public static class LinkedList{
//         node head;
//         node tail;
//         int size;

//         void addLast(int val){
//             if(size==0){
//             node temp = new node();
//             temp.data = val;
//             temp.next = null;
//             head = tail = temp;
//             size++;
//             }
//             else{
//                 node temp = new node();
//                 temp.data = val;
//                 temp.next = null;
//                 tail.next = temp;
//                 tail = temp;
//                 size++;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         LinkedList link = new LinkedList();
//         Scanner sc = new Scanner(System.in);
//         int val = sc.nextInt();
        
//         System.out.println(link);
//     }
// }

// class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int space=n/2;
//         int star=1;
//         for(int i=1;i<=n;i++){
//             System.out.println(space+","+star);
//             if(i<=n/2){
//                 space--;     //think while iteration is happening within the code
//                 star+=2;;
//             }else{
//                 space++;
//                 star-=2;
//             }
//         }
//     }
// }

// public class first{  
//     public static void main(String[] args){
//     int maths=90;
//     int physics=32;
//     int chemistry=90;
//     int average=(maths+physics+chemistry)/3;
//     if(maths<35||physics<35||chemistry<35){
//             System.out.println("fail");
//     }
// //         if(maths<35){
// //     System.out.println("fail");
// //     }
// //     else if(physics<35){
// //         System.out.println("fail");
// //     }
// //     else if(chemistry<35){
// //         System.out.println("fail");
// //     }
//     else if(average<=59){
//         System.out.println("C Grade");
//     }
//     else if(average<=69){
//         System.out.println("B Grade");
//     }
//     else{
//         System.out.println("A Grade");
//     }
//     }
// }

// public class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int star = n/2+1;
//         int space = 1;
//             for(int i=1;i<=n;i++){
//             for(int j=1;j<=star;j++){
//             System.out.print("*");
//             }
//             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=star;j++){
//                 System.out.print("*");
//             }
//             if(i<=n/2){
//                 star-=1;
//                 space+=2;
//             }
//             else{
//                 star+=1;
//                 space-=2;
//             }
//             System.out.println();
        
//     }
//     }
// }

// import java.util.*;
// import java.io.*;
// public class first{
// public static void swap(int[] arr, int i, int j){
//     int temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
// }
//     public static void main(String[] args){
//     int[] arr=new int[5];
//     arr[0]=10;
//     arr[1]=20;
//     arr[2]=30;
//     arr[3]=40;
//     arr[4]=50;

//     swap(arr,1,4);

//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//     }
// }
// }
// import java.util.*;
// class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr= new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int small=arr[0];
//         int large=arr[0];
//         for(int i=1;i<n;i++){
//             if(small>arr[i]){
//                 small=arr[i];
//             }
//             if(large<arr[i]){
//                 large=arr[i];
//             }
//         }
        
//         int diff=large-small;
//         System.out.println(diff);

//     }
// }

// class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr= new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int large=arr[0];
//         int small=arr[0];
//         for(int i=0;i<n;i++){
//             if(large<arr[i]){
//                 large=arr[i];
//             }
            
//             if(small>arr[i]){
//                 small=arr[i];
//             }
            
//         }
        
//         System.out.println(large);
//         System.out.println(small);
//         int diff=large-small;
//         System.out.println(diff);
//     }
// }

// class Switch{
//     public static void main(String[] args) {
//         int x=0;
//         switch(x){
//             case 0:
//                 System.out.println("This is 0");
//                 break;
//             case 1:
//                 System.out.println("This is 1");
//                 break;
//             default:
//                 System.out.println("This is default");
//         }
//     }
// }

// class DiagonalPrint{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 if(j==i){
//                 System.out.print("*");
//                 }
//                 else{
//                 System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// class FindingAnElement{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Give the input whose index you want to get");
//         int index=-1;
//         int inp = sc.nextInt();
//         for(int i=0;i<arr.length;i++){
//             if(inp==arr[i]){
//                 index=i;
//                 break;
//             }
//         }
//         System.out.println(index);
//     }
// }

// class BarChart{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int maxElement=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>maxElement){
//                 maxElement=arr[i];
//             }
//         }
//         System.out.println(maxElement);
//         for(int i=maxElement;i>=1;i--){
//             for(int j=0;j<arr.length;j++){
//             if(arr[j]>=i){
//                 System.out.print("*\t");
//             }
//             else{
//                 System.out.print(" \t");
//             }
//     }  
//     System.out.println();
//     }
// }
// }

// import java.util.*;
// class primeNumber{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// boolean primeFlag=true;
// for(int i=2;i<n;i++){
//     if(n%i==0){
//         primeFlag=false;
// }
// }

// if(primeFlag){
//     System.out.println("Prime No");
// }
// else{
//     System.out.println("Not a Prime No");
// }
// }
// }

// import java.util.*;
// class Loops{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i=1;i<=n;i++){
//         if(i%10==0){
//             continue;
//         }
//         if(i>100){
//             break;
//         }
//         System.out.println(i);
//     }
// }
// }

// 
// import java.util.*;
// class Kartikeya{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 System.out.println(n+"is not a prime number");
//                 break;
//             }
//             System.out.println(n+" is Prime no.");
//         }
//     }
// }

// import java.io.*;
// import java.util.*;

// public class first {
//   public static class Node {
//     int data;
//     Node next;
//   }

//   public static class LinkedList {
//     Node head;
//     Node tail;
//     int size;

//     void addLast(int val) {
//       // Write your code here
//         Node temp = new Node();
//         temp.data = val;
//         temp.next = null;
//       if(size==0){
//         head = tail = temp; 
//       }
//       else{
//         tail.next = temp;
//         tail = temp;  
//       }
//       size++;
      
//     }
//   }


//   public static void testList(LinkedList list) {
//     for (Node temp = list.head; temp != null; temp = temp.next) {
//       System.out.println(temp.data);
//     }
//     System.out.println(list.size);

//     if (list.size > 0) {
//       System.out.println(list.tail.data);
//     } 
//   }
//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     LinkedList list = new LinkedList();

//     String str = br.readLine();
//     while(str.equals("quit") == false){
//       if(str.startsWith("addLast")){
//         int val = Integer.parseInt(str.split(" ")[1]);
//         list.addLast(val);
//       } 
//       str = br.readLine();
//     }

//     testList(list);
//   }
// }

// import java.util.*;
// class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int n1=0;
//         int n2=1;
//         for(int i=0;i<n;i++){
//             int n3=n1+n2;
//             n1=n2;
//             n2=n3;
//             System.out.println(n1);
//         }
//     }
// }

// import java.util.*;
// class first{
//     static int Sum(int a, int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();;
//         int s=Sum(a,b);
//         System.out.println(s);
//     }
// }

// import java.util.*;
// class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print("Ab"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// class first{
//     static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         int factN = n*fact(n-1);
//         return factN;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = fact(n);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// class first{
//     static void printIncreasing(int n){
//         if(n==0){
//             return;
//         }
        
//         System.out.println(n);
//         printIncreasing(n-1);
//         System.out.println(n);
//     }
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printIncreasing(n);
//     }
// }

// import java.util.*;
// class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int start = sc.nextInt();
//         int end = sc.nextInt();
//         for(int i=0;i<arr.length;i++){
//             if((arr[i]>=start)&&(arr[i]<=end)){
//                 System.out.print(arr[i]+" ");
//             }
//         }
//     }
// }

// import java.util.*;
    
// class first{
//     static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         return n * fact(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int ans = fact(n);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no of students placed in CSE:");
//         int n1 = sc.nextInt();
//         System.out.println("Enter the no of students placed in ECE:");
//         int n2 = sc.nextInt();
//         System.out.println("Enter the no of students placed in MECH");
//         int n3 = sc.nextInt();
//         if(n1>n2 && n1>n3){
//             System.out.println("Highest placement");
//             System.out.println("CSE");
//         }
//         else if(n2>n1 && n2>n3){
//             System.out.println("Highest placement");
//             System.out.println("ECE");
//         }
//         else if((n1==n2)&&(n1==n3)){
//             System.out.println("None of the department has got the highest placement");
//         }
//         else if(n1==n2){
//             System.out.println("Highest placement");
//             System.out.println("CSE"+"\nECE");
//         }
//         else if(n2==n3){
//             System.out.println("Highest placement");
//             System.out.println("ECE"+"\nMECH");
//         }
//         else if(n1==n3){
//             System.out.println("Highest placement");
//             System.out.println("CSE"+"\nMECH");
//         }
//         else{
//             System.out.println("Highest placement");
//             System.out.println("MECH");
//         }
//     }
// }

// import java.util.*;
// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no of students placed in CSE:");
//         int n1 = sc.nextInt();
//         System.out.println("Enter the no of students placed in ECE:");
//         int n2 = sc.nextInt();
//         System.out.println("Enter the no of students placed in MECH");
//         int n3 = sc.nextInt();
//         if(n1>n2 && n1>n3){
//             System.out.println("Highest placement");
//             System.out.println("CSE");
//         }
//         else if(n2>n1 && n2>n3){
//             System.out.println("Highest placement");
//             System.out.println("ECE");
//         }
//         else if((n1==n2)&&(n1==n3)){
//             System.out.println("None of the department has got the highest placement");
//         }
//         else if(n1==n2){
//             System.out.println("Highest placement");
//             System.out.println("CSE"+"\nECE");
//         }
//         else if(n2==n3){
//             System.out.println("Highest placement");
//             System.out.println("ECE"+"\nMECH");
//         }
//         else if(n1==n3){
//             System.out.println("Highest placement");
//             System.out.println("CSE"+"\nMECH");
//         }
//         else{
//             System.out.println("Highest placement");
//             System.out.println("MECH");
//         }
//     }
// }

// import java.util.*;
// public class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no of liters to fill the tank");
//         int noOfLiters = sc.nextInt();
//         System.out.println("Enter the distance covered");
//         int distanceCovered = sc.nextInt();
//         if((noOfLiters<0)||(distanceCovered<0)){
//             if(noOfLiters<0){
//             System.out.println(noOfLiters+" is an Invalid Input");
//             }
//             if(distanceCovered<0){
//             System.out.println(distanceCovered+" is an Invalid Input");
//             }
//         }
//         else{    
//             Double nOfL = new Double(noOfLiters);
//             Double dC = new Double(distanceCovered);
//             double LiterP100KM = (nOfL/dC)*100;
//             double DinKM = distanceCovered*0.6214;
//             double FinGallons = noOfLiters*0.2642;
//             double MilesPerGallon = DinKM/FinGallons;
//             System.out.println("Liters/100KM");
//             System.out.println(String.format("%.2f",LiterP100KM));
//             System.out.println("Miles/gallons");
//             System.out.println(String.format("%.2f",MilesPerGallon));
//         }
//     }
// }

// import java.util.*;
// class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int rem = 0;
//         for(int i=0;i<2;i++){
//             int a = n%10;
//             rem = rem + a;
//             n=n/10;
//             // System.out.println(rem);
//         }
//         if((rem==3)||(rem==8)){
//             System.out.println("Lucky draw winner");
//         }
//         else{
//             System.out.println("Not a lucky draw winner");
//         }
//     }
// }

// import java.util.*;
// class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i=1;
//         int mod;
//         while(n>0)
//         {
//             mod=n%10;
//             System.out.println(mod*i);
//             i=i*10;
//             n=n/10;
//         }
//     }
// }


// import java.util.*;
// public class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         boolean result = str.matches("[a-zA-Z]+");
//         System.out.println("Does the string contains only alphabetical values: "+result);
//     }
// }

// import java.util.Scanner;

// class firstProgram {

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Take a input");
//         String s1="hacker";
// 		String name = sc.next();
// 		if(name.equals(s1)) {
// 			System.out.println("I am an executive engineer at Google");
// 		}
// 		else {
// 			System.out.println("I am a common man");
// 		}
		
//     }

// }

// import java.util.*;
// class isDigit{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char ch = sc.next().charAt(0);
//         if(Character.isDigit(ch)){
//             System.out.println("It is a digit");
//         }
//         else{
//             System.out.println("It is not a digit");
//         }
//     }
// }


// public class Main{
//         public static void main(String args[]){
//             Customer customer=new Customer(101,"Max","max@this.com");
//             SavingsAccount sA=new SavingsAccount(1001, customer, 10000, 500);
//             if(sA.withdraw(9000)){
//                 System.out.println(sA.getBalance());
//             }
//         }
// }


// import java.util.*;

// public class first{
//     static int caller(int n){
//         if(n==0){
//             return 1;
    
//         }

//         caller(n-1);
//         System.out.println(n);
//         return n;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         caller(n);
//     }
// }

// import java.util.*;
// class first{
//     static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         int factN = n*fact(n-1);
//         return factN;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = fact(n);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// class first{
//     static void f(int i,int n){
//         if(i>n){
//             return;
//         }
//         System.out.println("this is new");
//         f(i+1,n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i = sc.nextInt();
//         int n = sc.nextInt();
//         f(i,n);
//     }
// }

// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//     int[] arr ={1,2,3,4,5};
//     skip(arr,0,arr.length-1);
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//     }

//     private static void skip(int[] arr , int start , int end) {
//         if(start>=end){
//             return ;
//         }
//         swap(arr,start,end);
//         skip(arr,start+1,end-1);
//     }

//     private static void swap(int[] arr ,int start, int end) {
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//     }
// }

// import java.util.*;
// class Main
// {
//     public static int f(int n){
//         if(n<=1){
//             return n;
//         }
//         return f(n-1) + f(n-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(f(n));
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         String str="newbeeChan";
//         System.out.println(str);
//     }
// }

import java.util.*;
class first{
    static int fibac(int n){
        if(n<=1){
            System.out.println(n);
            return n;
        }
        return fibac(n-1) + fibac(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibac(n));
        }
}

