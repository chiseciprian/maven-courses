package ro.itschool.mvnbase.curs13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DocumentService {
    private final List<Document>documents;

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getAllDocuments(){
        return new ArrayList<>(documents);
    }

    public Document getDocumentWithName(String name){
        for (Document documentElement:documents){
            if (documentElement.getName().contains(name)){
                return documentElement;
            }
        }
        return null;
    }

    public Optional<Document> getDocumentById(String id){
        for (Document documentElement:documents){
            if (documentElement.getDocumentId().equals(id)){
                return Optional.of(documentElement);
            }
        }
        return Optional.empty();
    }

    public void addMarkup(String documentId,Markup markup){
       Optional<Document> findDocument= getDocumentById(documentId);
       if (findDocument.isPresent()) {
          findDocument.get().addMarkup(markup);
       }else {
           System.out.println(findDocument.isEmpty());
       }
    }
}
