package org.zerock.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
//	@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	//insert
	public void insert(BoardVO board);
	public Integer insertSelectKey(BoardVO board);
	
	//read
	public BoardVO read(Long bno);
	
	//delete
	public int delete(Long bno);
	
	//update
	public int update(BoardVO board);
}
