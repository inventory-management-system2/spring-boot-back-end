package com.teksystems.Capstone3BackEnd;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.ajp.AbstractAjpProtocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableConfigServer
public class Capstone3BackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(Capstone3BackEndApplication.class, args);
		
	}
//	 @Bean
//	    public TomcatServletWebServerFactory servletContainer() {
//	        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//	        Connector ajpConnector = new Connector("AJP/1.3");
//	        ajpConnector.setPort(9090);
//	        ajpConnector.setSecure(false);
//	        ajpConnector.setAllowTrace(false);
//	        ajpConnector.setScheme("http");
//	        tomcat.addAdditionalTomcatConnectors(ajpConnector);
//	        ((AbstractAjpProtocol) ajpConnector.getProtocolHandler()).setSecretRequired(false);
//	        return tomcat;
//	    }

}
