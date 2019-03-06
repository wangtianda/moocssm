package com.qfedu.serviceimp;


import com.qfedu.domain.Document;
import com.qfedu.mapper.DocumentDao;
import com.qfedu.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class DocumentServiceImp implements DocumentService {

    @Autowired
    private DocumentDao documentDao;


    @Override
    public List<Document> listAll() {
        try {
            List<Document> documents = this.documentDao.selectAll();
            return documents;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    @Override
    public void removeDocumentById(int parseInt) {
        try {
            documentDao.deleteDocumentById(parseInt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void batchRemove(Integer[] ids) {
        try {
            documentDao.batchDelete(ids);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
