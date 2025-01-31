package efub.backend.assignment.member.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberUpdateRequestDto {
    @NotBlank(message = "닉네임은 필수값입니다.")
    private String nickname;

    @Builder
    public MemberUpdateRequestDto(String nickname){
        this.nickname = nickname;
    }

}