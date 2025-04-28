import java.util.Scanner;

public class SingleNo2 {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int index=0;index<32;index++){
            int count =0;
            for(int i=0;i<n;i++){
                if((nums[i]&(1<<index))!=0){
                    count++;
                }
            }
            if(count%3==1){
                ans=ans|(1<<index);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        SingleNo2 obj = new SingleNo2();
        int result = obj.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
