package com.springbook.biz.board.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

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
    
    public void insertBoard(BoardVO vo) {
    	System.out.println("insertBoard()");
    	getJdbcTemplate().update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
    }
    
    public void updateBoard(BoardVO vo) {
    	System.out.println("updateBoard()");
    	getJdbcTemplate().update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
    }
    
    public void deleteBoard(BoardVO vo) {
    	System.out.println("deleteBoard()");
    	getJdbcTemplate().update(BOARD_DELETE, vo.getSeq());
    }
    
    public BoardVO getBoard(BoardVO vo) {
    	System.out.println("getBoard()");
    	Object[] args = {vo.getSeq()};
    	return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoardRowMapper());
    }

}
