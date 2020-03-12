package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	void insertBoard(BoardVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);

	BoardVO getBpard(BoardVO vo);

	List<BoardVO> getBoardList(BoardVO vo);

}
