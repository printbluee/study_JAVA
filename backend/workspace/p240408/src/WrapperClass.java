
/*
 * [ primitive type﻿ ] 

byte - short - char - int - long

float - double

boolean



[ reference type﻿ ] wrapper class (랩을 감싼 것처럼)

Byte - Short - Character - Integer - Long

Float - Double

Boolean

    기본형				   참조형
primitive type﻿	---->   reference type
			  (boxing)

primitive type﻿  <----   reference type
			  (unboxing)	
 */


public class WrapperClass {

	public static void main(String[] args) {
		
		int num = 3;
		Integer num2 = 5;
		System.out.println("num >> " + num);
		System.out.println("num2 >> " + num2);
		System.out.println("num2.toString() >> " + num2.toString());
		
		Integer num3 = num; // boxing
		int num4 = num3;	// unboxing
		
		System.out.println("num3 >> " + num3);
		System.out.println("num4 >> " + num4);
		
//		Integer num5 = new Integer(7);
		Integer num6 = Integer.valueOf(7);
//		System.out.println("num5 >> " + num5);
		System.out.println("num6 >> " + num6);
		
	}
}
