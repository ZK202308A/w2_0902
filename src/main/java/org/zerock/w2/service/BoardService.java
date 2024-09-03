package org.zerock.w2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.w2.mapper.BoardMapper;
import org.zerock.w2.vo.BoardVO;
import org.zerock.w2.vo.PageRequest;
import org.zerock.w2.vo.PageResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {
    private final BoardMapper boardMapper;

    @Transactional(readOnly = true)
    public PageResponse<BoardVO> getList(PageRequest pageRequest) {

        PageResponse<BoardVO> pageResponse
                = PageResponse.<BoardVO>with()
                .list(boardMapper.list(pageRequest))
                .total(boardMapper.count(pageRequest))
                .pageRequest(pageRequest)
                .build();

        return pageResponse;
    }

}















