package com.qfedu.service;

import com.qfedu.domain.Document;

import java.util.List;

public interface DocumentService {

    List<Document> listAll();

    void removeDocumentById(int parseInt);

    void batchRemove(Integer[] ids);
}
