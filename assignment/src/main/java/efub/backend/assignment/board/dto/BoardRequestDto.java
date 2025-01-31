package efub.backend.assignment.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

/*
{
    "boardTitle" : "벗들의 벼룩",
    "content" : "벗들의 중고거래 모임",
    "notice" : "사진을 꼭 올려야합니다!",
    "boardHostId" : 1
}
 */

@Getter
@NoArgsConstructor
public class BoardRequestDto {
    private String boardTitle;
    private String content;
    private String notice;
    private Long boardHostId;

}