package com.nix.tryout.time;

import java.time.Duration;

public class TimeTryouts {

	public static void main(String[] args) {

		Duration duration = Duration.ofDays(90);
		
		Duration duration2 = Duration.ofDays(1);
		
		System.out.println(duration2.toMinutes());
	}

}
