package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.app.loggerExtensions.JsonFormat;
import ar.edu.unlp.oo1.ejercicio1.app.loggerExtensions.LoggerUpperFormat;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		Logger postsLogger = Logger.getLogger("postLogger");
		postsLogger.setUseParentHandlers(false);
		FileHandler fileHandler = new FileHandler("outputsLogs");
		fileHandler.setFormatter(new JsonFormat());
		postsLogger.addHandler(fileHandler);
		postsLogger.info("Aplicacion iniciada");

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
