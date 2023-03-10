package com.example.ResourceServer.web.form;

import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberCreateForm {


    @NotEmpty(message = "사용자ID는 필수항목입니다.")
    private String id;

    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String pass;
}
