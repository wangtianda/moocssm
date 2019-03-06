package com.qfedu.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class DruidUtils {
    
    public static Connection getConnection(){
        Properties p = new Properties();
        File file = new File("D:/Users/Edianzu/IdeaProjects/mooc/src/com/qfedu/utils/druid.properties");
        try {
            FileInputStream in = new FileInputStream(file);
            p.load(in);
            DataSource dataSource = DruidDataSourceFactory.createDataSource(p);
            return dataSource.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    
    
}
