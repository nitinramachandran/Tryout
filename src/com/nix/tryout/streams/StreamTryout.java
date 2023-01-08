package com.nix.tryout.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamTryout {

	public static void main(String[] args) {
		
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();

		System.out.println(streamOfCollection);
	}

}
