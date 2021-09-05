class Demo{
    public static void main(String[] args){
        int num1=0;
        int num2=1;
        int count=1;
        System.out.print("");
        while(count>=2){
            int temp=num1;
            num1=num2;
            num2+=temp;
            System.out.print("num2+");
            count+=1；
        }
    }
}

