public class Task2 {
    public static void main(String[] args) {
        Task2 task2 =new Task2();
        task2.foo1(1000);
        System.out.println(task2.foo2(455625925));
        System.out.println(task2.foo3(1902091));
        System.out.println(task2.foo4(29));
        task2.foo5(45452);
        System.out.println("НОД - " + task2.nod(1648, 648));
        System.out.println("НОК - " + task2.nok(1648,648));
        System.out.println(task2.foo6(53242444));
        System.out.println(task2.foo7(496));
        System.out.println(task2.foo8(220,284));

    }

    // задание 1 (орёл или решка)
    public void foo1(int amount){
        int eagle=0;
        int tails=0;
        for (int i = 0; i < amount; i++) {
            if ((int)(Math.random()*2) == 1) {
                eagle++;
            } else {
                tails++;
            }
        }
        System.out.println("eagle-"+eagle+"\ntail-"+tails);
    }
    // возвращает наибольшую цифру натуральнгого числа
    public int foo2(int num){
        int max=num%10;
        while(num>0) {
            if(num%10>max){
                max=num%10;
            }
            num /= 10;
        }
        return max;
    }
    // проверяет является число палиндромом или нет
    public boolean foo3(int num){
        int b=num;
        int reverse=0;
        while(b>0){
            reverse=reverse*10+b%10;
            b/=10;
        }
        return reverse==num;
    }
    // проверяет простое число или нет
    public boolean foo4(int num){
        return Task2.numDividers(num)>1 ? false : true;
    }
    //возвращает количество делителей числа
    public static int numDividers(int num){
        int dividers=0;
        for (int j = 1; j < num; j++) {
            if(num%j==0){
                dividers++;
            }
        }
        return dividers;
    }
    //находит все порстые делители числа
    public void foo5(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                int dividers= Task2.numDividers(i);
                if(dividers==1) {
                    System.out.println(i);
                }
            }
        }
    }
    // НОД
    public int nod(int num1, int num2){
        return num2==0 ? num1:nod(num2, num1%num2);
    }
    // НОК
    public int nok(int num1, int num2){
        return num1/nod(num1,num2)*num2;
    }
    // возвращает количество разных цифр числа
    public int foo6(int num){
        int different=0;
        int numerals[]=new int[10];
        while(num>0){
            numerals[num%10]++;
            num/=10;
        }
        for (int i = 0; i < 10; i++) {
            if(numerals[i]>0){
                different++;
            }
        }
        return different;
    }
    // проверяет является ли число совершенным
    public boolean foo7(int num){
        return Task2.sumDividers(num)==num ? true: false;
    }
    // проверяет являются ли 2 числа дружественными
    public boolean foo8(int num1, int num2){
        int sumDividers1= Task2.sumDividers(num1);
        int sumDividers2= Task2.sumDividers(num2);
        return (sumDividers1==num2 && sumDividers2==num1) ? true : false;
    }
    //возвращает сумму собственных делителей числа
    public static int sumDividers(int num){
        int sumDividers=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sumDividers+=i;
            }
        }
        return sumDividers;
    }
}

