package cn.migu.interceptor;

public enum TcpType {
    LOGIN(5,"login success"),
    LOGIN_ERROR(9,"login error"),
    LOGOUT(6,"logout"),
    KICKOUT(10,"kickout"),
    TOKEN_CHANGE(7,"token change"),
    HEARTBEAT(8,"heartbeat")
    ;


    private int code;
    private String name;

    TcpType(int code,String name){
        this.code=code;
        this.name=name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
