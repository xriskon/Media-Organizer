package main.java.service;

import java.io.File;

public class FileLoader {
    private File directory;

    public String[] getFiles() {
        return directory.list();
    }

    public File getDirectory() {
        return directory;
    }

    public void setDirectory(File directory) {
        this.directory = directory;
    }
}
