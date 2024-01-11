package com.phptravels.test;

import java.util.Arrays;

public class Hello2 {

	/*Compare the below 2 arrays and findout the Matched Elements & UnMatched Elements

	int array3[]={9,4,6,0,5,8}

	int array4[]={7,3,1,2,9,0,6}

	Output should be:

	===================

	Matched   Elements: 0,6,9

	UnMatched Elements: 1,2,3,4,5,8

	 


		*/
	public static void main(String[] args) {
		int array3[]={9,4,6,0,5,8};

		int array4[]={7,3,1,2,9,0,6};
		
		
		
int[] matchedvalue = Arrays.stream(array3).filter(value->Arrays.stream(array4).anyMatch(x->x==value)).toArray();
				
				
				System.out.println(Arrays.toString(matchedvalue));
			
int[] unmatchedvalue = Arrays.stream(array3).filter(value->Arrays.stream(array4).noneMatch(x->x==value)).toArray();
				
				
				System.out.println(Arrays.toString(unmatchedvalue));	
	}}
	
