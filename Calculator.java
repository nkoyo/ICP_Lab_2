package lab_exercise_2;

/**
 * @author Larkuo Wilson-Tetteh
 * @author Tamisha Dzifa Segbefia
 * @version 1.0.0
 */

import java.lang.Math;

public class Calculator {
    private String Brand; // this refers to the model of the calculator
    private String screenSize; // this refers to the size of the calculator display
    private double answer = 0; // this will store the recent values of answer and update as necessary (i.e. when the operations run)

    public Calculator() {
        this.Brand = "CASIO";
        this.screenSize = "25 x 25";
    }

    /**
     * This constructor allows the user to input the brand of the calculator, as well as the size of the calculator display/screen.
     * @param calculatorBrand
     * @param calculatorScreenSize
     */
    public Calculator(String calculatorBrand, String calculatorScreenSize){
        this.Brand = calculatorBrand;
        this.screenSize = calculatorScreenSize;
    }

    // getters and setters

    /**
     * Method returns a string which is the brand of the calculator
     * @return Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * Method takes a string as input and sets it as the brand of the calculator
     * @param brand
     */
    public void setBrand(String brand) {
        Brand = brand;
    }

    /**
     * Method returns a string which is the size of the display of the calculator
     * @return screenSize
     */
    public String getScreenSize() {
        return screenSize;
    }

    /**
     * Method takes a string as input and sets it as the size of the display of the calculator
     * @param screenSize
     */
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * Method returns a double which is the value of the last answer calculated by the calculator
     * @return answer
     */
    public double getAnswer() {
        return answer;
    }

    // methods

    /**
     * Method adds two numbers and returns the result
     * @param numOne
     * @param numTwo
     * @return sum
     */
    public double addNumbers(double numOne, double numTwo){
        double sum = numOne + numTwo;
        this.answer = sum;
        return sum;
    }

    /**
     * Method subtracts the second number from the first number and returns the result
     * @param numOne
     * @param numTwo
     * @return difference
     */
    public double subtractNumbers(double numOne, double numTwo){
        double difference = numOne - numTwo;
        this.answer = difference;
        return difference;
    }

    /**
     * Method multiplies both numbers and returns the result
     * @param numOne
     * @param numTwo
     * @return product
     */
    public double multiplyNumbers(double numOne, double numTwo){
        double product = numOne * numTwo;
        this.answer = product;
        return product;
    }

    /**
     * Method divides the first number by the second number and returns the result
     * @param numOne
     * @param numTwo
     * @return quotient
     */
    public double divideNumbers(double numOne, double numTwo){
        double quotient = numOne / numTwo;
        this.answer = quotient;
        return quotient;
    }

    /**
     * Method returns the square of the input number
     * @param numOne
     * @return square
     */
    public double squareNumber(double numOne){
        double square = numOne * numOne;
        this.answer = square;
        return square;
    }

    /**
     * Method finds the square root of the input number and returns the result
     * @param numTwo
     * @return
     */
    public double rootOfNumber(double numTwo){
        double root = Math.sqrt(numTwo);
        this.answer = root;
        return root;
    }

    public static void main(String[] args) {
        Calculator Larks = new Calculator("Texas Instruments", "25 x 30");
        System.out.println(Larks.addNumbers(12, 24.3));
        System.out.println(Larks.subtractNumbers(12, 24.3));
        System.out.println(Larks.multiplyNumbers(12, 24.3));
        System.out.println(Larks.divideNumbers(12, 0));
        System.out.println(Larks.squareNumber(12));
        System.out.println(Larks.rootOfNumber(24.3));
    }
}
