package com.seonhak.mytodolist.entity;

import lombok.Getter;

public enum User {
    USER(Authority.USER),  // 사용자 권한
    ADMIN(Authority.ADMIN);  // 관리자 권한

    @Getter
    private final String authority;
    private String password;
    User(String authority) {
        this.authority = authority;
    }

    User(String authority, String password) {
        this.authority = authority;
        this.password = password;
    }

    public static class Authority {
        public static final String USER = "ROLE_USER";
        public static final String ADMIN = "ROLE_ADMIN";
    }
}