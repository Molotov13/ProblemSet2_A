/*
 * @Leo
 * @9.29
 * ProblemSet 2-A
 */
public class Calculator {
    public double quadraticMinus(int a, int b,int c){
        // a is the coefficient of x^2
        // b is the coefficient of x
        // c is the constant
        double rt2 = (-b - Math.sqrt((double)(b*b-4*a*c))) / (double)(2*a);
        return rt2;
    }
    public double quadraticPlus(int a, int b,int c){
        // a is the coefficient of x^2
        // b is the coefficient of x
        // c is the constant
        double rt1 = (-b + Math.sqrt((double)(b*b-4*a*c))) / (double)(2*a);
        return rt1;
    }
    public double slope(int x1, int y1, int x2, int y2){
        // x1 and x2 are x-coordinate of the two points
        // y1 and y2 are y-coordinate of the two points
        double m = (double)(y1 - y2)/ (double)(x1 - x2);
        return m;
    }
    public double midpointX(int x1, int y1, int x2, int y2){
        // x1 and x2 are x-coordinate of the two points
        // y1 and y2 are y-coordinate of the two points
        return ((double)(x1+x2))/2;
    }
    public double midpointY(int x1, int y1, int x2, int y2){
        // x1 and x2 are x-coordinate of the two points
        // y1 and y2 are y-coordinate of the two points
        return ((double)(y1+y2))/2;
    }
    public double sumArith(double ft, double dif, int num){
        // ft is the first term
        // dif is the common difference
        // num is the number of terms
        double res = (ft + ft + (num - 1) * dif) * num / 2;
        return res;
    }
    public double sumGeo(double ft, double rate, int num){
        // ft is the first term
        // rate is the increasing rate
        // num is the number of terms
        double res = ft * (1 - Math.pow(rate,num)) / (1 - rate);
        return res;
    }
    public void display(){
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for "+1+"x^2 + "+5+"x "+6+" are "+ quadraticPlus(1,5,6) +" and "+ quadraticMinus(1,5,6) +".\n");

        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points ("+0+","+0+") and ("+2+","+3+") has a slope of "+ slope(0,0,2,3)+".\n");

        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between ("+0+","+0+") and ("+2+","+3+") is ("+ midpointX(0,0,2,3)+","+ midpointY(0,0,2,3)+").\n");

        System.out.println("SUM OF AN ARTITHMETIC SERIES");
        System.out.println("The sum of the first "+5+" terms of an arithmetic series that starts with "+1+" and increases by "+ 1 + " is "+ sumArith(1,1,5) +".\n");

        System.out.println("SUM OF AN GEOMETRIC SERIES");
        System.out.println("The sum of the first "+3+" terms of a finite geometric series that starts with "+3+" and increases by a rate of "+ 2.0 + " is "+sumGeo(3,2,3)+".\n");
        return;
    }
}
