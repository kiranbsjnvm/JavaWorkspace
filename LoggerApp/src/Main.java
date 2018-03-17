import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

	static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		
		//LogManager lm = LogManager.getLogManager();
		//Logger logger = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		logger.setLevel(Level.ALL); 
		logger.entering("Main.class", "Main()"); 
		
		
		logger.log(Level.INFO, "Info Log msg");
		logger.info("Info Log msg 2");
		logger.logp(Level.WARNING, "Main", "main()", "Wrn message 1");
		logger.log(Level.INFO, "{0} is my faourate", "Cricket");
		logger.log(Level.WARNING, "{0} is {1} days after {2}", new Object[]{"Friday",2,"wed"});
		
		logger.exiting("Main.class", "Main()");
		
	}

}
