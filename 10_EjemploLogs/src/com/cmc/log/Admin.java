package com.cmc.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger = LogManager.getLogger(Admin.class);
	public void agregar(){
		logger.info("Mensaje de info");
		logger.warn("Mensaje de warn");
		logger.debug("Mensaje debug");
		logger.error("Mensaje de error");
		logger.trace("Mensaje de trace");
	}
}
