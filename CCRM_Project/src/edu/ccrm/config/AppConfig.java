package edu.ccrm.config;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;

public final class AppConfig {
    private static AppConfig instance;

    private final Path dataFolder;
    private final DateTimeFormatter tsFormatter;

    private AppConfig() {
        this.dataFolder = Paths.get("./data");
        this.tsFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) instance = new AppConfig();
        return instance;
    }

    public Path getDataFolder() { return dataFolder; }
    public DateTimeFormatter getTsFormatter() { return tsFormatter; }
}
