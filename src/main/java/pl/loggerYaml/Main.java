package pl.loggerYaml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {


    public static void main(String[] args) {

        System.out.println("pl.loggerYaml.Main is running...:");

        Logger logger = LogManager.getLogger();

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");


        System.out.println("end of main loggers.");


        System.out.println("creating new object otherClassLoggers & running...");

        OtherClassLoggers otherClassLoggers = new OtherClassLoggers();
        otherClassLoggers.creepyTask();

        System.out.println("END");
    }
}
