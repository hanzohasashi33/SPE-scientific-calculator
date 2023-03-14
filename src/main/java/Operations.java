import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Operations {

    private static final Logger logger = LogManager.getLogger(Operations.class);
    public double addition(double num1, double num2) {
        logger.info("[ADDITION] - " + num1 + ", " + num2);
        logger.info("[RESULT - ADDITION] - " + (num1 + num2));
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        logger.info("[SUBTRACTION] - " + num1 + ", " + num2);
        logger.info("[RESULT - SUBTRACTION] - " + (num1 - num2));
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        logger.info("[MULTIPLICATION] - " + num1 + ", " + num2);
        logger.info("[RESULT - MULTIPLICATION] - " + (num1 * num2));
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        logger.info("[DIVISION] - " + num1 + ", " + num2);
        if(num2 == 0) {
            logger.info("[ERROR - DIVISION] - Division by 0 is not possible");
            throw new ArithmeticException("Division by 0 is not possible");
        }
        logger.info("[RESULT - DIVISION] - " + (num1/num2));
        return num1/num2;
    }


    public double squareRoot(double num) {
        logger.info("[SQRT] - " + num);
        if(num < 0) {
            logger.info("[ERROR - SQRT] - Negative square roots not possible");
            throw new ArithmeticException("Negative square roots not possible");
        } else {
            logger.info("[RESULT - SQRT] - " + Math.sqrt(num));
            double res = Math.sqrt(num);
            return res;
        }
    }


    public double factorial(int num) {
        logger.info("[FACTORIAL] - " + num);
        if(num < 0) {
            logger.info("[ERROR - FACTORIAL] - Factorial of negative number not possible");
            throw new ArithmeticException("Factorial of negative number not possible");
        } else {
            long res = 1;
            for(int factor = 2; factor <= num; factor++) {
                res *= factor;
            }
            logger.info("[RESULT - FACTORIAL] - " + res);
            return res;
        }
    }


    public double naturalLog(double num) {
        logger.info("[LOGe] - " + num);
        if(num < 0) {
            logger.info("[ERROR - Loge] - Natural log of negative numbers is not defined");
            throw new ArithmeticException("Natural log of negative numbers is not defined");
        } else if(num == 0) {
            logger.info("[ERROR - Loge] - Natural log of zero is not defined");
            throw new ArithmeticException("Natural log of zero is not defined");
        } else {
            double res = Math.log(num);
            logger.info("[RESULT - LOGe] - " + res);
            return res;
        }
    }

    public double logBaseTen(double num) {
        logger.info("[LOG] - " + num);
        if(num < 0) {
            logger.info("[ERROR - Log] - Natural log of negative numbers is not defined");
            throw new ArithmeticException("Natural log of negative numbers is not defined");
        } else if(num == 0) {
            logger.info("[ERROR - Log] - Natural log of zero is not defined");
            throw new ArithmeticException("Natural log of zero is not defined");
        } else {
            double res = Math.log10(num);
            logger.info("[RESULT - LOG] - " + res);
            return res;
        }
    }

    public double power(double base, double pow) {
        logger.info("[POWER] - " + base + " " + pow);
        double res = Math.pow(base, pow);
        logger.info("[RESULT - POWER] - " + res);
        return res;
    }
}
