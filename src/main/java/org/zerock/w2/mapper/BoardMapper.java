package org.zerock.w2.mapper;


import org.zerock.w2.vo.BoardVO;
import org.zerock.w2.vo.PageRequest;

public interface BoardMapper  {

    java.util.List<BoardVO> list(PageRequest pageRequest);

    Long insert(BoardVO vo);

    int delete(Long bno);

    int update(BoardVO vo);

    BoardVO select(Long bno);
	
}
