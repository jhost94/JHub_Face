package com.jhost.template.Face.config.constant;

/**
 * <p>
 *
 * </p>
 */
public enum MessagePaths {
    TEST_MESSAGE("test.message");

    private final String message;

    MessagePaths(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
