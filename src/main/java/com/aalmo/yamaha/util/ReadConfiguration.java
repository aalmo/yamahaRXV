package com.aalmo.yamaha.util;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author almoayed
 *
 */
public class ReadConfiguration {
	private Properties 					configProp 	= null;
	final static  Logger 				logger 		= Logger.getLogger("ReadConfiguration");
	private static ReadConfiguration 	instance 	= null;

	/**
	 * 
	 */
	public ReadConfiguration() {
		if (this.configProp == null) {
			configProp = new Properties();
			InputStream input = null;
			try {

				input = getClass().getClassLoader().getResourceAsStream("yamaha.properties");
				// load a properties file
				configProp.load(input);

			} catch (IOException ex) {
				logger.error(ex);
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						logger.error(e);
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static ReadConfiguration getInstance() {
		logger.debug("Entry: Create getInstance");
		if (instance == null) {
			instance = new ReadConfiguration();
		}
		return instance;
	}
	
	public String port(String property){
		return this.configProp.getProperty(property);
	}
	
	
	public String[] getSMSLines(String SMSListName) throws IOException {
		String fileLocation =  this.configProp.getProperty("Baselocation") + SMSListName;
		FileReader fileReader = new FileReader(fileLocation);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			lines.add(line);
		}
		bufferedReader.close();
		return lines.toArray(new String[lines.size()]);
	}
	
	public String getProperty(String property){
		return this.configProp.getProperty(property);
	}
	
	public void loadConfigFile(String configName) {
		
	}
}
