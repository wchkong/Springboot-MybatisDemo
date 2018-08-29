package com.mybatis.enums;

/**
 * @author wchkong
 */

public enum UserSexEnum {
    /**
     *
     */
    UNKNOWN(2),
    /**
     * 男
     */
    MALE(1),
    /**
     * 女
     */
    FEMALE(0);

    private final int value;

    public int getValue() {
        return value;
    }

    UserSexEnum(int value){
        this.value = value;
    }

    public static UserSexEnum valueOf(int value) {
        for (UserSexEnum type : UserSexEnum.values()) {
            if (value == type.getValue()) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
