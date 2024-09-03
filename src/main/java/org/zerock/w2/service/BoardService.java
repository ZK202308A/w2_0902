package org.zerock.w2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.w2.mapper.BoardMapper;
import org.zerock.w2.vo.BoardVO;
import org.zerock.w2.vo.PageRequest;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public List<BoardVO> getList(PageRequest pageRequest) {
        return boardMapper.list(pageRequest);
    }

}
