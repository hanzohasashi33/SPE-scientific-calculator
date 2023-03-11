public class Operations {
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if(num2 == 0) {
            throw new ArithmeticException("Division by 0 is not possible");
        }
        return num1/num2;
    }


    public double squareRoot(double num) {
        if(num < 0) {
            throw new ArithmeticException("Negative square roots not possible");
        } else {
            double res = Math.sqrt(num);
            return res;
        }
    }


    public double factorial(int num) {
        if(num < 0) {
            throw new ArithmeticException("Factorial of negative number not possible");
        } else {
            long res = 1;
            for(int factor = 2; factor <= num; factor++) {
                res *= factor;
            }
            return res;
        }
    }


    public double naturalLog(double num) {
        if(num < 0) {
            throw new ArithmeticException("Natural log of negative numbers is not defined");
        } else if(num == 0) {
            throw new ArithmeticException("Natural log of zero is not defined");
        } else {
            double res = Math.log(num);
            return res;
        }
    }

    public double logBaseTen(double num) {
        if(num < 0) {
            throw new ArithmeticException("Natural log of negative numbers is not defined");
        } else if(num == 0) {
            throw new ArithmeticException("Natural log of zero is not defined");
        } else {
            double res = Math.log10(num);
            return res;
        }
    }

    public double power(double base, double pow) {
        double res = Math.pow(base, pow);
        return res;
    }
}
