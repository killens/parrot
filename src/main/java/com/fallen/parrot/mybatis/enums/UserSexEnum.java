package com.fallen.parrot.mybatis.enums;

public enum UserSexEnum {
    UNKOWN("0"), MAN("1"), WOMAN("2");

    private String value;

    private UserSexEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static UserSexEnum string2Enum(String sexType) {
        UserSexEnum[] sexes = UserSexEnum.values();
        for (UserSexEnum type : sexes) {
            if (type.getValue().equals(sexType)) {
                return type;
            }
        }
        return UserSexEnum.UNKOWN;
    }

    public String getString() {
        switch (value) {
            case "0":
                return "未知";
            case "1":
                return "男";
            case "2":
                return "女";
        }
        return "未知";
    }

}
