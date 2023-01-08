package com.nix.tryout.reflections;

public class ClassToBeReflected {

    private Integer userid;
    private String username;

    public ClassToBeReflected(Integer userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    private String updateString(String val, int id) {
        this.userid = id;
        this.username = val;
        return username + " Yo Yo" + userid;
    }

    private Integer doCalc() {
        return this.userid + 25 * 3;
    }

    private void voidMethod(){
        this.userid = 11111;
        this.username = "Set from Void method";
    }

    @Override
    public String toString() {
        return userid + " : " + username;
    }
}