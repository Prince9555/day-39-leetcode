import java.util.Scanner;

public class day39 {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 9) {
            sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static int fact(int num)
    {int fact=1;
        if(num<3)
        {
            return num;
        }
        for(int i=2;i<=num;i++)
        {
           fact=fact*i;
        }
        return fact;
    }

    public static boolean strong(int num)
    {
        int ans=num;
        if(num<3)
        {
            return true;
        }
        int finalre=0;
        while(num>0)
        {
            int ld=num%10;
            int result=fact(ld);
            finalre=finalre+result;
            num=num/10;
        }
         
         return finalre==ans;
        }
        
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
       // System.out.println(sumOfDigits(n));
       System.out.println(strong(145));
    }
}





// leetcode 
/*class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans= new ArrayList<>();
        for(int num=1;num<=n;num++){
            boolean divisibleby3=(num%3==0);
            boolean divisibleby5=(num%5==0);
            if(divisibleby3 && divisibleby5){
                ans.add("FizzBuzz");
            }
            else if(divisibleby3){
                ans.add("Fizz");
            }
            else if(divisibleby5){
                ans.add("Buzz");
            }
            else{
                ans.add(Integer.toString(num));
            }
        }
        return ans;
    }
}



class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num==1)
        {return false;}
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                sum=sum+i+num/i;
            }
        }
        if(num==sum)
        {
            return true;
        }
        return false;
        
    }
}*/