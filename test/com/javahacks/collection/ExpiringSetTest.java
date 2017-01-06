package com.javahacks.collection;

/**
 * 
 * @author arjunrao87
 *
 */
public class ExpiringSetTest {

	public static void main( String... args ) throws InterruptedException{
		TimeBasedExpiringSet<Integer> set = new TimeBasedExpiringSet<>( 1000 );
		for( int i = 0; i< 100; i++ ){
			set.add(i);
			Thread.sleep(500);
		}
		Thread.sleep(1000000);
	}
}
