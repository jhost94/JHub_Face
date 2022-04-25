package com.jhost.template.Face.wrapper;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;


public class ResponseEntity<T> extends org.springframework.http.ResponseEntity<T> {

    public ResponseEntity(HttpStatus status) {
        super(status);
    }

    public ResponseEntity(T body, HttpStatus status) {
        super(body, status);
    }

    public ResponseEntity(MultiValueMap<String, String> headers, HttpStatus status) {
        super(headers, status);
    }

    public ResponseEntity(T body, MultiValueMap<String, String> headers, HttpStatus status) {
        super(body, headers, status);
    }

    @Builder
    public ResponseEntity(T body, MultiValueMap<String, String> headers, int rawStatus) {
        super(body, headers, rawStatus);
    }
}
