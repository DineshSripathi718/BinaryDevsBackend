package com.binarydevs.Entities.enums;

public enum UserRole {

    ROLE_ADMIN("Admin"),
    ROLE_USER("User");

    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
