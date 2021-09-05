public class ScannerTest1{
    public static void main(String args[]){
        System.out.println(2002);
        Scanner reader=new Scanner(System.in);
        int firstYear=reader.nextlant();
        int length=100;
        int year;
        for (inti=0;i<=length;i++) {
            year = firstYear + i;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                System.out.println(year);
            }
        }
    }


