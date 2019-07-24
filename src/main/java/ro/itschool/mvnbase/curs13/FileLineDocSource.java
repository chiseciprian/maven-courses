package ro.itschool.mvnbase.curs13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLineDocSource implements DocSource {
    private final List<Document> documents;

    public FileLineDocSource(String path) throws IOException {
        this.documents = fetchDocument(path);
    }

    private List<Document> fetchDocument(String path) throws IOException {
        List<Document> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader((path)));
        String line = breader.readLine();
        String name = null;
        while (line != null) {
            if (name == null) {
                name = line;
            } else {
                result.add(new Document(name, line));
                name = null;
            }
            line = breader.readLine();

        }
        return result;
    }

    @Override
    public List<Document> getDocuments() {
        return documents;
    }
}
