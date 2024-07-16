package com.devteria.identityservice.dto.request.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "USER_INVALID")
    String username;

    @Size(min = 8, message = "USER_PASSWORD")
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
