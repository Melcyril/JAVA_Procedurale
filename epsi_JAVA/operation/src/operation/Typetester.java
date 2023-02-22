/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author cyril
 */
public class Typetester {
       protected int numerique=0;
        int printType(byte x) {
            numerique=1;
            return numerique;
        }

        int printType(int x) {
            numerique=2;
            return numerique;
        }

        int printType(float x) {
            numerique=3;
            return numerique;
        }

        int printType(double x) {
            numerique=3;
            return numerique;
        }
}
