package org.zerock.w2.vo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {

	private Long bno;
	private String title;
	private String content;
	private String writer;
	
	private LocalDateTime regDate;
	private LocalDateTime modDate;
	
}
