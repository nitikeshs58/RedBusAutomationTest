package com.rbus.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.rbus.base.EnvConfigLoader;

public class EnvConfigLoader {

	static Logger logger = LoggerFactory.getLogger(EnvConfigLoader.class);

	public static void SetContext() {
		String env = System.getProperty("env", "UAT");
		logger.info("selected env is: {}", env);
		switch (env) {
		case "UAT":
			EnvProps.baseUrl = "https://www.redbus.in/";
			EnvProps.apiUrl = "";
		case "dev":

		}
	}

}
