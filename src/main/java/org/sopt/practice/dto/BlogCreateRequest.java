package org.sopt.practice.dto;

import org.springframework.web.multipart.MultipartFile;

public record BlogCreateRequest(
        String title,
        String description,
        MultipartFile image
) {
}

