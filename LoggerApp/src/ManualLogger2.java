import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ManualLogger2 {

	static Logger logger = Logger.getLogger("ManualLogger2");
	
	public static void main(String[] args) throws SecurityException, IOException {

		//the file location is C:\Users\KiranKumar B S\logFile_0.log [%h means home directory]
		//1000 means max size of one file
		//3 means rotation of files, file name goes from 0 to 2 [logFil_0.log, logFile_1.log, logFile_2.log]
		FileHandler handler = new FileHandler("%h/logFile_%g.log", 1000, 3);
		Formatter formatter = new SimpleFormatter();
	
		handler.setFormatter(formatter);
		logger.addHandler(handler);
		
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO,"Warn msg");
	}

}
