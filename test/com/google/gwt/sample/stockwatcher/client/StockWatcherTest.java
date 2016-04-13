package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.sample.stockwatcher.shared.FieldVerifier;
import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * GWT JUnit tests must extend GWTTestCase.
 */
public class StockWatcherTest extends GWTTestCase { 
	
	/**
	 * Must refer to a valid module that sources this class.
	 */
	public String getModuleName() { 
		return "com.google.gwt.sample.stockwatcher.StockWatcher";
	}

	/**
	 * Add as many tests as you like.
	 */
	public void testSimple() { 
		assertTrue(true);
	}

}
