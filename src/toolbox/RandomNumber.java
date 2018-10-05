/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

import java.util.Random;

/**
 *
 * @author josedg
 */
public class RandomNumber {
    /**
     * Function that generates a random number between the two specified
     * @param min - Inclusive. Minimum value
     * @param max - Exclusive. Maximum value
     * @return - returns an Integer number
     */
       public static double generateRandomNumber(int min, int max) {
           Random rand = new Random();
           double result = rand.nextInt(max) + min;
           return result;
       }
}
