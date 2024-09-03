package org.zerock.w2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.w2.mapper.BoardMapper;
import org.zerock.w2.vo.BoardVO;
import org.zerock.w2.vo.PageRequest;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {
    private final BoardMapper boardMapper;

    @Transactional(readOnly = true)
    public List<BoardVO> getList(PageRequest pageRequest) {
        return boardMapper.list(pageRequest);
    }

}
