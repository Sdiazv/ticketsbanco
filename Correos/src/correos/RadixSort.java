/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package correos;

import java.util.Scanner;

/**
 *
 * @author Stephanie
 */
public class RadixSort {
    public static void sort(int[]a){
     int i, m=a[0],exp=1,n=a.length;
     int []b=new int [10];
     for(i=1;i<n;i++){
         if(a[i]>m){
             m=a[i];
             }
     }
     while(m/exp>0){
         int[]bucket=new int [10];
         for(i=0;i<n;i++){
            bucket[(a[i]/exp)%10]++;
            }
         for(i=1;i<10;i++){
             bucket[i]+=bucket[i-1];
             }
         for(i=n-1;i>=0;i--){
             b[--bucket[(a[i]/exp)%10]]=a[i];
             }
         for(i=0;i<n;i++){
             a[i]=b[i];
         
          }    
        
         
         exp*=10;
     }
         
         
     
    }
           
    public static void main(String[] args) {
       Scanner scan =new Scanner (System.in);
       System.out.println("Radix sort Test\n");
       int n, i;
       System.out.println("ingrese los numeros ";
       n=scan.nextInt();
       int arr[]=new int[n];
       System.out.println("\nEnter"+n+"Elementos de tipo Entero");
       for(i=0;i<n;i++){
           arr[i]=scan.nextInt();
       }
       sort(arr);
       System.out.println("\nElementos antes de ser ordenados");
       for(i=0;i<n;i++){
           System.out.println(arr[i]);
       System.out.println();
       
       }
       
       
    }
}
