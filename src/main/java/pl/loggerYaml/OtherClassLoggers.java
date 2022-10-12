package pl.loggerYaml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OtherClassLoggers {

    private static Logger logger = LogManager.getLogger();
    public void creepyTask(){
        System.out.println("jestem w klasie inne loggery, metoda creepy..., wywołuję loggery:");


        logger.debug("This is a debug message creepyTask");
        logger.info("This is an info message creepyTask");
        logger.warn("This is a warn message creepyTask");
        logger.error("This is an error message creepyTask");
        logger.fatal("This is a fatal message creepyTask");
    }
}
