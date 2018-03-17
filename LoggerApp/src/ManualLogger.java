import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ManualLogger {

	static Logger logger = Logger.getLogger("ManualLogger");
	public static void main(String[] args) {

		Handler handler = new ConsoleHandler();
		Formatter formatter = new SimpleFormatter();
		handler.setFormatter(formatter);
		logger.addHandler(handler);
		
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO,"Warn msg");
	}

}
