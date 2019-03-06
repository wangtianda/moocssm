package com.qfedu.mapper;

import com.qfedu.domain.Document;

import java.sql.SQLException;
import java.util.List;

public interface DocumentDao {

    List<Document> selectAll()throws Exception;

    void deleteDocumentById(int parseInt) throws SQLException;

    void batchDelete(Integer[] ids) throws SQLException;
}
