package studio6;

import java.awt.Color;
import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
		double sum = 0; 
		sum = Math.pow(0.5, n); 
			
		if(n == 0) {
			return 1/2;
		} 
		
		return sum + geometricSum(n - 1); 
		
			
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			if (p % q == 0) {
				return q; 
			}
			
			int temp = q; 
			q = p % q; 
			p = temp; 
			return gcd(p, q); 
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int index = array.length - 1; 
		helper(array, index); 
		return array; 
	}
	
	private static void helper(int[] array, int index) {
		if (index > 0) {
			int temp = array[index - (array.length-2)];
			array[index - array.length] = array[index]; 
			array[index] = temp; 
			helper(array, index - 1); 
		}
	}
	


	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		if (radius < radiusMinimumDrawingThreshold) {
			return; 
		}
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.circle(xCenter, yCenter, radius); 
		circlesUponCircles(xCenter + radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter - radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter + radius, radius/3, radiusMinimumDrawingThreshold);  
		circlesUponCircles(xCenter, yCenter - radius, radius/3, radiusMinimumDrawingThreshold);  


	}
	
	public static void circleHelper(double x, double y, double radius) {
		StdDraw.setPenColor(Color.BLACK);  
		
	}
	
	public static void main(String[] args) {

	}

}
