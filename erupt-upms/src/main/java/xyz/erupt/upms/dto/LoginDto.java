package xyz.erupt.upms.dto;

import lombok.Data;

@Data
public class LoginDto {

    /*
    *
    *
    * @RequestParam String account, @RequestParam String pwd,
                            @RequestParam(required = false) String verifyCode,
                            @RequestParam(required = false) String verifyCodeMark
    * */
    private String account;
    private String pwd;
    private String verifyCode;
    private String verifyCodeMark;
}
