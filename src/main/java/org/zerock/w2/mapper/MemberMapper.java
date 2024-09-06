package org.zerock.w2.mapper;

import org.apache.ibatis.annotations.Param;
import org.zerock.w2.vo.MemberVO;

public interface MemberMapper {

    void insert(MemberVO member);

    void insertRole(@Param("mid") String mid, @Param("role")  String role);

}
