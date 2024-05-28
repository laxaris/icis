package com.icis.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void showTables() {
        List<String> tables = jdbcTemplate.queryForList("SHOW TABLES;", String.class);
        tables.forEach(System.out::println);
    }
}
