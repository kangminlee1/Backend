package mcnc.survwey.domain.survey.manage.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mcnc.survwey.domain.enums.QuestionType;
import mcnc.survwey.domain.selection.SelectionId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    @NotNull(message = "질문 아이디는 필수입니다.")
    private Long quesId;
    private QuestionType questionType;
    @NotNull(message = "응답은 필수입니다.")
    private String response;
    private SelectionId selectionId;
}