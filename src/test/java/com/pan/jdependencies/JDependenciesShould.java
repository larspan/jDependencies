package com.pan.jdependencies;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

public class JDependenciesShould {

	@Test
	public void test() {
		JDependencies jdepend = new JDependencies();
		String result = jdepend.analyze(Collections.<String>emptyList());
		assertEquals("FirstFile => SecondFile", result);
	}

}
