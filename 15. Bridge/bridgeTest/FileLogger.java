package bridgeTest;

import java.util.*;

public class FileLogger implements MessageLogger {

	public void logMsg(String msg) {
		FileUtil futil = new FileUtil();
		futil.writeToFile("log.txt", msg, true, true);
	}
}
