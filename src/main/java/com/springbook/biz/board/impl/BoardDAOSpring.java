package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

// DAO
@Repository
public class BoardDAOSpring {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String BOARD_INSERT = "INSERT INTO BOARD(SEQ, TITLE, WRITER, CONTENT) VALUES((SELECT NVL(MAX(SEQ), 0)+1 FROM BOARD),?,?,?)";
	private final String BOARD_UPDATE = "UPDATE BOARD SET TITLE=?, CONTENT=? WHERE SEQ=?";
	private final String BOARD_DELETE = "DELETE BOARD WHERE SEQ=?";
	private final String BOARD_GET = "SELECT * FROM BOARD WHERE SEQ=?";
	private final String BOARD_LIST = "SELECT * FROM BOARD ORDER BY SEQ DESC";

	public void insertBoard(BoardVO vo) {
		System.out.println("insertBoard()");
		jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("updateBoard()");
		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("deleteBoard()");
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("getBoard()");
		Object[] args = { vo.getSeq() };
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("getBoardList()");
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	}
}