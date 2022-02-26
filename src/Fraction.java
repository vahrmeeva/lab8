public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    //считакм нод
    /*public static int countNod(int num1, int num2){
        while (num2!=0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    //считаем нок
    public static int countNok(int num1, int num2){
        if (num2==0){
            return num1;
        }
        return countNod(num2, num1 % num2);
    }*/

    //считаем сумму
    public static Fraction sum(Fraction fraction1, Fraction fraction2) {
        int denominatorFraction3 = fraction1.denominator * fraction2.denominator;
        int numeratorFraction3 = fraction1.numerator * fraction2.denominator + fraction2.numerator * fraction1.denominator;
        return new Fraction(numeratorFraction3, denominatorFraction3);

    }
    //завести переменную у которой записать резкльтат переменной в классе
    public Fraction sum2(Fraction fraction2){
        Fraction fraction3 = new Fraction();
        fraction3.numerator = (this.numerator * fraction2.denominator) + (fraction2.numerator * this.denominator);
        fraction3.denominator = this.denominator * fraction2.denominator;
        //что такое класс конструктор переменные класса экземпляр класса
        return fraction3;
    }

    public static Fraction vich(Fraction fraction1, Fraction fraction2) {
        int denominatorFraction3 = fraction1.denominator * fraction2.denominator;
        int numeratorFraction3 = fraction1.numerator * fraction2.denominator - fraction2.numerator * fraction1.denominator;
        return new Fraction(numeratorFraction3, denominatorFraction3);
    }

    public Fraction vich2(Fraction fraction2) {
        Fraction fraction3 = new Fraction();
        fraction3.denominator = this.denominator * fraction2.denominator;
        fraction3.numerator = this.numerator * fraction2.denominator - fraction2.numerator * this.denominator;
        return fraction3;
    }

    public static Fraction umnog(Fraction fraction1, Fraction fraction2){
        int numeratorFraction3 = fraction1.numerator * fraction2.numerator;
        int denominatorFraction3 = fraction1.denominator * fraction2.denominator;
        return new Fraction(numeratorFraction3,denominatorFraction3);
    }

    public Fraction umnog2(Fraction fraction2){
        Fraction fraction3 = new Fraction();
        fraction3.numerator = this.numerator * fraction2.numerator;
        fraction3.denominator = this.denominator * fraction2.denominator;
        return fraction3;
    }

    public static Fraction delenie(Fraction fraction1, Fraction fraction2){
        int newden = fraction2.numerator;
        int newnum = fraction2.denominator;
        int numeratorFraction3 = fraction1.numerator* newnum;
        int denominatorFraction3 = fraction1.denominator*newden;
        return new Fraction(numeratorFraction3,denominatorFraction3);
    }

    public Fraction delenie2(Fraction fraction2){
        Fraction fraction3 = new Fraction();
        fraction3.numerator = this.numerator* fraction2.denominator;
        fraction3.denominator = this.denominator*fraction2.numerator;
        return fraction3;
    }


    @Override
    public String toString() {
        return "(дробь)=" +
                " числитель=" + numerator +
                "; знаменатель=" + denominator;
    }

}

