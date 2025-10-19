package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account details"
)
public class AccountsDto
{

    @Schema(
            description = "Account number of the customer",example = "1234567890"
    )
    @NotEmpty(message = "Name should not be empty")
    @Pattern(regexp = "^$|[0-9]{10}",message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Customer type of the customer",example = "savings"

    )
    @NotEmpty(message = "Account type should not be empty")
    private String accountType;

    @Schema(
            description = "Branch address of the customer",example = "123 Main Street, New York"
    )
    @NotEmpty(message = "Branch address should not be empty")
    private String branchAddress;
}
