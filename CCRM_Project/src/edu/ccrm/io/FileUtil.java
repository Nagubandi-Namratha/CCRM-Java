package edu.ccrm.io;

import edu.ccrm.config.AppConfig;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileUtil {
    public static void ensureDataFolder() throws IOException {
        Path p = AppConfig.getInstance().getDataFolder();
        if (!Files.exists(p)) Files.createDirectories(p);
    }

    public static Path createTimestampedBackup(Path sourceDir) throws IOException {
        ensureDataFolder();
        DateTimeFormatter fmt = AppConfig.getInstance().getTsFormatter();
        String ts = LocalDateTime.now().format(fmt);
        Path dest = AppConfig.getInstance().getDataFolder().resolve("backup_" + ts);
        Files.walkFileTree(sourceDir, new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                Path targetDir = dest.resolve(sourceDir.relativize(dir));
                Files.createDirectories(targetDir);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.copy(file, dest.resolve(sourceDir.relativize(file)), StandardCopyOption.REPLACE_EXISTING);
                return FileVisitResult.CONTINUE;
            }
        });
        return dest;
    }
}
