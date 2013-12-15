package com.peter.construct.decorator;

import com.peter.construct.decorator.Sourcable;

public class Source implements Sourcable {

	@Override
	public void method() {

		System.out.println("Original Source method!");
	}


}
