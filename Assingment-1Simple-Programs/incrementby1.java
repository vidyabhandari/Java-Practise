import java.util.Scanner;

public class incrementby1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // 123

        int result = 0;
        int place = 1;

        while (num > 0) { //123 12 1 
            int rem = num % 10; //rem(3) = 123%10  rem(2)=12%10 rem(1)=1%10
            rem = (rem + 1) % 10; //rem(4)=(3+1)%10  rem(3)=(2+1)%10  rem(2)=(1+1)%10
            result = result + rem * place; //result(4)=0+4*1  result(34)=4+3*10  result(234)=34+2*100
            place = place * 10; //place(10)=1*10  place(100)=10*10  place(1000)=100*10
            num = num / 10; //num(12)=123/10  num(1)=12/10  num(0)=1/10
        }

        System.out.println(result);
    }
}
