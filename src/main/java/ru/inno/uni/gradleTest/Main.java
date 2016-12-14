package ru.inno.uni.gradleTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by julia on 09.12.2016.
 */
public class Main {
    private static Counter counter = new Counter();
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        for (String resourse: args) {
            Thread t = new ResourseHandler(resourse, counter);
            t.start();
        }
        logger.info("Message");
        System.out.println(counter.getCount());
    }
}
