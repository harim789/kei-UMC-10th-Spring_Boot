package com.example.umc10th.domain.mission.exception.code;

import com.example.umc10th.global.apiPayload.code.BaseErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum MissionErrorCode implements BaseErrorCode {
    MISSION_NOT_FOUND(HttpStatus.NOT_FOUND, "MISSIOIN404_1", "MISSION_NOT_FOUND"),
    MISSION_ALREADY_COMPLETED(HttpStatus.CONFLICT, "MISSION409_1", "이미 완료된 미션입니다.");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
