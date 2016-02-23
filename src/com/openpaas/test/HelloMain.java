package com.openpaas.test;

import java.util.Map;

public class HelloMain {

	public static void main(String[] args) {
		String sVcap = "no";
	    
#		System.out.println("System Environment:");

		for (Map.Entry<String, String> envvar : System.getenv().entrySet()) {
	        System.out.println(envvar.getKey() + ": " + envvar.getValue());
	        
	        if(envvar.getKey().equalsIgnoreCase("VCAP_APPLICATION"))
	        	sVcap = envvar.getValue();
	    }
		
		System.out.println("VCAP_APPLICATION: " + sVcap);
	}
}
