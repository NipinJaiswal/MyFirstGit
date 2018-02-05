import java.util.*;
class Linked
{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    a[0]=sc.nextInt();
    for(int i=1;i<n;i++){
        int nn=sc.nextInt();
          int m=a[i-1];
          if(m<nn){
            a[i]=nn;
          }else{
            //int mn=a[i-1];
            a[i-1]=nn;
            a[i]=m; 
          }
        
    }
    for(int i=0;i<n;i++){
      System.out.print(a[i]);
    }
  }
}

