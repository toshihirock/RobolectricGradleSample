package com.example.hellowrold;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import com.example.helloworld.MainActivity;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
	
	public MainActivity activity;
	
	@Before
	public void setup() {
		this.activity = Robolectric.buildActivity(MainActivity.class).create().get();
	}
	
	@Test
	public void sumメソッドで1と3の和は4となること() throws Exception {
		int expected = 4;
		int actual = activity.sum(1, 3);
		assertThat(actual, is(expected));
	}

}
