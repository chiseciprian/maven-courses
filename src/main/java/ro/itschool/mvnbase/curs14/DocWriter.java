package ro.itschool.mvnbase.curs14;


import ro.itschool.mvnbase.curs13.Document;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DocWriter {
    private final String path;
    private BufferedWriter fileWriter;
    private boolean opened;

    public DocWriter(String path) throws IOException {
        this.path = path;
        fileWriter = new BufferedWriter(new FileWriter(path));
        this.opened = true;
    }

    public void writte(Document document) throws IOException {
        if (!opened) {
            fileWriter = openedWithAppend();
        }
        fileWriter.write(document.getDocumentId() + "|" + document.getName() + "|" + document.getContent());
        fileWriter.newLine();
        fileWriter.flush();
    }

    public void writte(List<Document> documents) throws IOException {
        for (Document docElemet:documents){
            this.writte(docElemet);
        }
    }

    private BufferedWriter openedWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(path, true));
    }

    public void close() throws IOException {
        opened = false;
        fileWriter.close();
    }
}
