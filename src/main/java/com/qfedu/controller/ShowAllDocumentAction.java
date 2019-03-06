package com.qfedu.controller;

import com.qfedu.domain.Document;
import com.qfedu.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShowAllDocumentAction  {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "showAll",method = RequestMethod.POST)
    @ResponseBody
    public List<Document> showAll() {

        System.out.println("进来了");

        return  this.documentService.listAll();




    }



}
