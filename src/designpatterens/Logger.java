package designpatterens;

import java.io.Serializable;

public class Logger implements Serializable{
	
	//make singleton
	private Logger() {}
	
	static class LoggerHolder {
		private static Logger logger = new Logger();
	}
	
	public Logger getInstance () {
		return LoggerHolder.logger;
	}

}
