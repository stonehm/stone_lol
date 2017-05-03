package com.stone.lol.user.enums;

/**
 * 登录状态
 */
public enum LoginStatEnum {
    SUCCESS(1,"秒杀成功"),
    END(0,"秒杀结束"),
    REPEAT_KILL(-1,"重复秒杀"),
    INNER_ERROR(-2,"系统异常"),
    DATA_REWRITE(-3,"数据篡改");

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
