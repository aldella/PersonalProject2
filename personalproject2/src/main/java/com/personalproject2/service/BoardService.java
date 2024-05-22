package com.personalproject2.service;

import java.util.List;

import com.personalproject2.per.dto.Board;

public interface BoardService {
	public List<Board> getBoardList();
	public Board getBoard(int bno);
	public void insBoard(Board board);
	public void upBoard(Board board);
	public void delBoard(Board board);
}
