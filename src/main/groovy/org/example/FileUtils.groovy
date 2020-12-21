package org.example

class FileUtils {
    static <T extends FileReader & FileWriter> void readAndWrite(T file) {
        file.readLines()
        file.write("Hello")
    }
}

