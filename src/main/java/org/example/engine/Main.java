package org.example.engine;

import org.example.first.First;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("Application started");
        First first = new First();
        LOG.info("first is: ".concat(first.toString()));
        LOG.info("Application finished");
    }
}
