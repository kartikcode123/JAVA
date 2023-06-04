import java.util.Scanner;

public class bubble_sort {
    static void bsort(int a[],int n){
        int t,i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n-1-i;j++){
                if(a[j]>a[i]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }

        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bsort(a,n);
    }
}
