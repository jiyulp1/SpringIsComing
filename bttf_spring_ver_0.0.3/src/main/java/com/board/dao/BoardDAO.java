package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {
	//notice list
	public List<BoardVO> list() throws Exception;
	//notice write
	public void write(BoardVO vo) throws Exception;
	// 게시물 조회
	public BoardVO view(int bno) throws Exception;
	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;
	// 게시물 삭제
	public void delete(int bno) throws Exception;
}
