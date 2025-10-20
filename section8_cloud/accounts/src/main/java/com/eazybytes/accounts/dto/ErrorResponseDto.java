package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold Error Response details"
)
public class ErrorResponseDto
{
    @Schema(
            description = "API path invoked by client",example = "/api/create"
    )
    private String apiPath;

    @Schema(
            description = "Error code",example = "500"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message",example = "An error occurred. Please try again or contact Dev team")
    private String errorMsg;

    @Schema(
            description = "Error time of API "
    )
    private LocalDateTime errorTime;
}
