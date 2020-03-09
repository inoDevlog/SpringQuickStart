package com.springbook.biz.board.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// DAO
@Repository
public class BoardDAOSpring extends JdbcDaoSupport {
	
	private final String BOARD_INSERT = "INSERT INTO BOARD(SEQ, TITLE, WRITER, CONTENT) VALUES((SELECT NVL(MAX(SEQ), 0)+1 FROM BOARD),?,?,?)";
    private final String BOARD_UPDATE = "UPDATE BOARD SET TITLE=?, CONTENT=? WHERE SEQ=?";
    private final String BOARD_DELETE = "DELETE BOARD WHERE SEQ=?";
    private final String BOARD_GET = "SELECT * FROM BOARD WHERE SEQ=?";
    private final String BOARD_LIST= "SELECT * FROM BOARD ORDER BY SEQ DESC";
    
    @Autowired
    public void setCuperDataSource(DataSource dataSource) {
    	super.setDataSource(dataSource);
    }

}
