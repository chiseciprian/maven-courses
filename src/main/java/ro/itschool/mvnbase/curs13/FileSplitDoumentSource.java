package ro.itschool.mvnbase.curs13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSplitDoumentSource implements DocSource {
    private final List<Document> documents;

    public FileSplitDoumentSource(String path) throws IOException {
        this.documents = fetchDocument(path);
    }

    private List<Document> fetchDocument(String path) throws IOException {
        List<Document> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader((path)));
        String line;
        String[] splitResult;
        while ((line = bufferedReader.readLine()) != null) {
            splitResult = line.split("~");
            result.add(new Document(splitResult[0], splitResult[1]));
        }
        return result;
    }

    @Override
    public List<Document> getDocuments() {
        return documents;
    }
}
