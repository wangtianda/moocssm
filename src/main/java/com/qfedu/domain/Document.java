package com.qfedu.domain;

import lombok.Data;

import java.util.Date;
@Data
public class Document {
    private Integer id;
    private String name;
    private Classify kind;
    private UserInfo uploadUser;
    private String key;
    private String url;
    private String summary;
    private Date uploadDate;



}
