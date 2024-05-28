package com.personalproject2.per.dao;

import java.util.List;

import com.personalproject2.per.dto.Board;

public interface BoardDAO {
	public List<Board> getBoardList();
	public Board getBoard(int bno);
	public void insBoard(Board board);
	public void upBoard(Board board);
	public void delBoard(Board board);
}
