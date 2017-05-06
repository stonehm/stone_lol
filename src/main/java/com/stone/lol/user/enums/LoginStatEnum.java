package com.stone.lol.user.enums;

/**
 * 登录状态
 */
public enum LoginStatEnum {
    SUCCESS(1, "登录成功"),
    LOCKED(0, "账号被锁"),
    NOT_FOUND(-1, "用户不存在"),
    PASSWORD_ERROR(-2, "密码错误");

    private int state;

    private String stateInfo;

    LoginStatEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static LoginStatEnum stateOf(int index) {
        for (LoginStatEnum state : values()) {
            if (state.getState() == index)
                return state;
        }
        return null;
    }
}
