package com.fallen.parrot.mybatis.enums;

public enum UserSexEnum {
    UNKOWN(0), MAN(1), WOMAN(2);

    private int value;

    private UserSexEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static UserSexEnum int2Enum(int sexType) {
        UserSexEnum[] sexes = UserSexEnum.values();
        for (UserSexEnum type : sexes) {
            if (type.getValue() == sexType) {
                return type;
            }
        }
        return UserSexEnum.UNKOWN;
    }

    public String getString() {
        switch (value) {
            case 0:
                return "未知";
            case 1:
                return "男";
            case 2:
                return "女";
        }
        return "未知";
    }

}
