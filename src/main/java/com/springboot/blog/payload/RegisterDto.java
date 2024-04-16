package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        description = "RegisterDto Model Information"
)
public class RegisterDto {

    @Schema(
            description = "Register name"
    )
    private String name;

    @Schema(
            description = "Register user name"
    )
    private String username;

    @Schema(
            description = "Register email"
    )
    private String email;

    @Schema(
            description = "Register password"
    )
    private String password;
}

