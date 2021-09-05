import java.util.Scanner;
public class AnalyzeNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System);
        System.out.println;
        int n=input.nextlnt();
        double[] numbers=new double[n];
        double sum=0;
        System.out.println;
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextDouble();
            sum+=numbers[i];
        }
        double avg=sum/n;
        System.out.println;
        System.out.println;
        for（int i=0；i<n;i++){
    if(numbers[i]>avg){
        System.out.println(numbers[i]);
    }
        }
    }
}
