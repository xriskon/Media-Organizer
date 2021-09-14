package main.java.service;

import java.io.File;

public class FileLoader {
    private File directory;
    private File[] files;

    private File[] retrieveFiles() {
        return directory.listFiles();
    }

    public File getDirectory() {
        return directory;
    }

    public void setDirectory(File directory) {
        this.directory = directory;
        retrieveFiles();
    }

    public File[] getFiles() {
        return files;
    }
}
