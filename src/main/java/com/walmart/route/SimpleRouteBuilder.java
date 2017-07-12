package com.walmart.route;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:/Santosh Docs/My Project/tarento/Apache camel/test/inputFolder?noop=true").to("file:C:/Santosh Docs/My Project/tarento/Apache camel/test/outputFolder");
	}
	
}
