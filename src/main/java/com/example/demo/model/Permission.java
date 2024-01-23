package com.example.demo.model;

public enum Permission {
    READ_GRANT("developers:read"),
    WRITE_GRANT("developers:write");
    
    private final String permission;
    
    Permission(String permission) {
        this.permission = permission;
    }
    
    public String getPermission() {
        return permission;
    }
}