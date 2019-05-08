public class Task1 {
    public static void main(String[] args) {
        Task1 main=new Task1();
        System.out.println(main.foo1(36, 34, 36));
        System.out.println(main.foo1_1(36, 34, 36));
        main.foo2(24.5);
        System.out.println(main.foo3(23.6, 14.2));
        System.out.println(main.foo4(8531));
        main.foo5(439853);
        System.out.println(main.foo6(4857131));
        main.foo7(24, 54);
    }

    //Задание 1
    private String foo1(int number1, int number2, int number3){
        if(number1==number2 && number1==number3){
            return "Все числа одинаковы";
        } else if(number1==number2 && number2!=number3){
            return "Первое и второе одинаковы";
        } else if(number1==number3 && number1!=number2){
            return "Первое и третье одинаковы";
        } else if(number2==number3 && number1!=number3){
            return "Второе и третье одинаковы";
        } else {
            return "Все числа различны";
        }
    }
    //Задание 1 (2 вариант)
    private String foo1_1(int number1, int number2, int number3){
        return (number1==number2 && number2==number3) ? "Числа одинаковы" : "Числа различны";
    }
    //Задание 2
    private void foo2(double kg){
        double mgram=kg/1000000;        //милиграмм
        double gram=kg/1000;            //грамм
        double ton=kg*1000;             //тон
        System.out.println(
                "Милиграмм - "+mgram+
                        "\nГрамм - "+gram+
                        "\nТонн - "+ton);
    }
    //Задание 3
    private double foo3(double radius1, double radius2){
        return Math.PI*(Math.pow(radius1,2)-Math.pow(radius2, 2));
    }
    //Задание 4
    private String foo4(int number){
        int numerals[]=new int[4];      //массив для цифр
        numerals[0]=number%10;
        number/=10;
        numerals[1]=number%10;
        number/=10;
        numerals[2]=number%10;
        number/=10;
        numerals[3]=number%10;
        if(numerals[0]<numerals[1] && numerals[1]<numerals[2] && numerals[2]<numerals[3]){
            return "Убывающая";
        } else if(numerals[0]>numerals[1] && numerals[1]>numerals[2] && numerals[2]>numerals[3]){
            return "Возрастающая";
        } else {
            return "Нет последовательности";
        }
    }
    //ЗАдание 5
    private void foo5(int number){
        int numerals[]=new int[6];      //массив для цифр
        numerals[0]=number%10;
        number/=10;
        numerals[1]=number%10;
        number/=10;
        numerals[2]=number%10;
        number/=10;
        numerals[3]=number%10;
        number/=10;
        numerals[4]=number%10;
        number/=10;
        numerals[5]=number%10;
        int sumNumerals=numerals[0]+numerals[1]+numerals[2]+numerals[3]+numerals[4]+numerals[5];
        double arMean=sumNumerals/6;                        //среднее арифметическое
        double geoMean=Math.exp(Math.log(sumNumerals)/6);   //среднее геометрическое
        System.out.println("Среднее арифметическое-"+arMean
                +"\nСреднее геометрическое-"+geoMean);
    }
    //Задание 6
    private int foo6(int number){
        int numerals[]=new int[7];      //массив для цифр
        numerals[0]=number%10;
        number/=10;
        numerals[1]=number%10;
        number/=10;
        numerals[2]=number%10;
        number/=10;
        numerals[3]=number%10;
        number/=10;
        numerals[4]=number%10;
        number/=10;
        numerals[5]=number%10;
        number/=10;
        numerals[6]=number%10;
        return numerals[0]*1_000_000+numerals[1]*100_000+numerals[2]*10_000+
                numerals[3]*1_000+numerals[4]*100+numerals[5]*10+numerals[6];
    }
    //Задание 7
    private void foo7(int number1, int number2){
        if(number1 == number2){
            System.out.println("Числа равны");
        } else {
            number1 += number2;
            number2 = number1 - number2;
            number1 -= number2;
            System.out.println("первое число = " + number1 + "\nвторое число = " + number2);
        }
    }
}
