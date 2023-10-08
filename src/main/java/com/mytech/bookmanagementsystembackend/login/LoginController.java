package com.mytech.bookmanagementsystembackend.login;

import com.mytech.bookmanagementsystembackend.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/login")
@Slf4j
@CrossOrigin("*")
public class LoginController {

    @PostMapping
    public ResponseEntity<ApiResponse<UserDto>> login(@RequestBody UserDto userDto) {
        log.info("username : {}", userDto.getUsername());
        log.info("password : {}", userDto.getPassword());
        ApiResponse<UserDto> apiResponse = ApiResponse.<UserDto>builder()
                .body(userDto)
                .statusCode(HttpStatus.OK.value())
                .build();
        return ResponseEntity.ok(apiResponse);
    }
}
