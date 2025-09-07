import java.util.*;
public class SumUptoZero {
    public int[] countZero(int n){
        int[] ans=new int[n];
        int index=0;
        for(int i=1;i<=n/2;++i){
            ans[index++]=i;
            ans[index++]=-i;
        }
        if(n%2==1){
            ans[index]=0;
        }
        Arrays.sort(ans);
        return ans;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SumUptoZero obj = new SumUptoZero();
        // System.out.println(obj.countZero(n));
        int[] result = obj.countZero(n);     

        System.out.println(Arrays.toString(result)); 
        sc.close();
    }
}
