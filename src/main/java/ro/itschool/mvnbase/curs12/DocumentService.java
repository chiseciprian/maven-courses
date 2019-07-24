package ro.itschool.mvnbase.curs12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.Collections.unmodifiableList;

public class DocumentService {
    private final List<Document> documents;


    public DocumentService(List<Document> documentList) {
        this.documents = new ArrayList<>(documentList);
    }

    public List<Document> getAllDocuments() {
       return unmodifiableList(documents);
    }

    public Optional<Document> getDocumentWithName(String name) {
        for (Document document : documents) {
            if (document.getName().contains(name)) {
               return Optional.of(document);
            }
        }
        return Optional.empty();
    }

    public void addMarkupForDocument(Markup markup,String documentId){
        Optional<Document> document =getDocumentById(documentId);
        if (document.isPresent()){
            document.get().addMarkup(markup);
        }
    }


    public Optional<Document> getDocumentById(String id) {
        for (Document document:documents){
            if (document.getDocumentId().equals(id)){
                return Optional.of(document);
            }
        }
        return Optional.empty();
    }

    public List<Markup> getMarkupsForDocument(String id){
        Optional<Document> document=getDocumentById(id);
       if (document.isPresent()){
           return   document.get().getMarkups();
       }
        return Collections.emptyList();
    }

//    public String getDocumentContentWithMarkups(String documentid){
//        Optional<Document>document=getDocumentById(documentid);
//        List<Markup>documentMarkups= new ArrayList<>(document.get().getMarkups());
//        String newContent=document.get().getContent();
//        for (int i=0;i<newContent.length();i++){
//
//        }
//    }









}
