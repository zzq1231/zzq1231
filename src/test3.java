public class GreaterCommonFactor {
    static void getGreaterCommonFactor(int a,int b){
        int k=0;
        System.out.print("gcd("+a+“，”+b+“)=”）；
        do{
            k=a%b;
            a=b;
            b=k;
        }
        while（k！=0);
System.out.println（a);
    }
    public static void main(String args[]){
        getGreaterCommonFactor(12,18);
    }
}
