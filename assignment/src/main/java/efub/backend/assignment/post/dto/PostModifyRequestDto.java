package efub.backend.assignment.post.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
{
    "writedId" : 1,
    "title" : "수정한 제목",
    "content": "수정한 내용입니다~"
}
 */
@Getter
@AllArgsConstructor
public class PostModifyRequestDto {
    private Long writerId;
    private String title;
    private String content;

    }
