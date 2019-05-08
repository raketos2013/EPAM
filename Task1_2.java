public class Task1_2 {
    public static void main(String[] args) {
        Task1_2 ts=new Task1_2();
        ts.foo4(28,2,1700);
        ts.foo4(28,2,1600);
        ts.foo4(30,5,2019);
    }

    //Задание 1
    private void foo1(int x1, int y1, int x2, int y2, int x3, int y3 ){
        if(x1==x2 && x1==x3 && y1==y2 && y1==y3){
            System.out.println();
        } else {
            int a = (y1 - y2) / (x1 - x2);
            int b = y1 - a * x1;
            double y = a * x3 + b;
            if (y3 == y) {
                System.out.println("Не треугольник");
            } else {
                double q=Math.pow((y2-y1),2)+Math.pow((x2-x1),2);
                double w=Math.pow((y2-y3),2)+Math.pow((x2-x3),2);
                double e=Math.pow((y1-y3),2)+Math.pow((x1-x3),2);
                if(q==w+e || w==q+e || e==w+q){
                    System.out.println("Прямоугольный");
                }else{
                    System.out.println("Не прямоугольный");
                }
            }
        }

    }
    //Задание 2
    private void foo2(int age){
        int numberHeads = 0;
        if(age < 200){
            numberHeads = age*3+3;
        } else if(age >= 200 && age < 300){
            numberHeads=(age-200)*2+200*3+3;
        } else {
            numberHeads=200*3+100*2+3+age-300;
        }
        System.out.println("Количество голов - " + numberHeads
                            + "\nКоличество глаз - " + numberHeads*2);
    }
    //Задание 3 (1 способ)
    private boolean foo3_1(char symbol){
        if(symbol=='a' || symbol=='e' || symbol=='i' || symbol=='o' ||
                symbol=='u' || symbol=='y' || symbol=='A' || symbol=='E' ||
                symbol=='I' || symbol=='U' || symbol=='Y' || symbol=='O'){
            return true;
        } else {
            return false;
        }
    }
    //Задание 3 (2 способ)
    private boolean foo3_2(char symbol){
        if((int)symbol==65 || (int)symbol==69 || (int)symbol==73 || (int)symbol==79 ||
                (int)symbol==85 || (int)symbol==89 || (int)symbol==97 || (int)symbol==101 ||
                (int)symbol==105 || (int)symbol==111 || (int)symbol==117 || (int)symbol==121){
        return true;
        }else{
            return false;
        }
    }
    //Задание 3 (3 способ)
    private boolean foo3_3(char symbol){
        return "AEIOUYaeiouy".indexOf(symbol) != -1;
    }
    /*
    //Задание 3 (4 способ)
    private boolean foo3_4(char symbol){
        return ((1 << symbol) & 2130466) != 0;
    }*/
    //Задание 4
    private void foo4(int day, int month, int year){
        int nextDay;
        int nextMonth;
        int nextYear;
        int k=0;
        if(year%4==0 && year%100==0 && year%400!=0){
        } else
        if(year%4==0 || (year%4==0 && year%100==0 && year%400==0)){
            k=1;
        }
        if(day==31 && month==12){
            nextYear=year+1;
            nextMonth=1;
            nextDay=1;
        }else{
            if((day==31 && (month==1 || month==3|| month==5|| month==7|| month==8|| month==10)) ||
                    (day==30 && (month==4 || month==6|| month==9|| month==11)) ||
                    (day==28 && k==0 && month==2) ||
                    (day==29 && k==1 && month==2)){
                nextYear=year;
                nextMonth=month+1;
                nextDay=1;
            } else {
                nextDay=day+1;
                nextMonth=month;
                nextYear=year;
            }
        }
        System.out.println("Следующий день - "+nextDay+"."+nextMonth+"."+nextYear);
    }
}
