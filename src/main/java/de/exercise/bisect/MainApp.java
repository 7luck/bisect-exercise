/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exercise.bisect;

/**
 *
 * @author loki
 */
public class MainApp {
    
    private static Polynom polynom;
    private static double eps = 0.002f;
    private static int maxIteration = 100;
    private static int counter = 0;

    public static void main(String[] args) {
        polynom = new Polynom(0, 1, -2, -3, 0);
        
        bisect( (double) 1, (double) 4);

        System.out.println("Ergebnis Subtraktion: " + minus(4, 7));
        System.out.println("Ergebnis Multiplikation: " + multi(7, 4));
        
        
    }
    
    private static Double bisect(double a, double b) {
        final double epsilon = 0.00001;
        double y_m = 0.0, m = 0.0;
        //und es funktioniert....
        // JUHUUU
        // we are not done yet, das ist hoffentlich alles auf develop
        // x^3-2*x^2-3*x
        do {
            m = (a + b) / 2;
            y_m = polynom.calc(m);
            System.out.println("Iteration: " + counter + ", a = " + a + ", b = " + b + ", m = " + m + ", y(m) = " + y_m);
            
            
            if (y_m > 0) {
                b = (a + b) / 2;
                m = b;
                
            } else if (y_m < 0) {
                a = (a + b) / 2;
                m = a;
            } else {
                break;
            }
            
        } while (Math.abs(y_m) > epsilon && counter < maxIteration);
        return m;
    }

    public static int sum(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    public static int minus(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }
    public static int multi(int zahl1, int zahl2){
        return zahl1 * zahl2;
    }

}
