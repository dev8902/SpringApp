/**
 * 
 */
package com.naresh.spring.test;

import java.nio.ByteBuffer;

/**
 * @author Naresh
 *
 */
public class Test {
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ByteBuffer byteBuffer=ByteBuffer.allocate(8);
		byte b2=10;
		byteBuffer.put(b2);
		byteBuffer.put(b2);
		byte[] b=byteBuffer.array();
		for(byte b1:b){
			System.out.println(b1);
		}
		
	}

}
