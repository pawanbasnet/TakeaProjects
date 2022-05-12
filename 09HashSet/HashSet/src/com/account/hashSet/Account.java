package com.account.hashSet;
public class Account{
    private int Aid;
    private String Aname;
    public int getAid() {
        return Aid;
    }
    public void setAid(int aid) {
        Aid = aid;
    }
    public String getAname() {
        return Aname;
    }
    public void setAname(String aname) {
        Aname = aname;
    }
    public Account(int aid, String aname) {
        Aid = aid;
        Aname = aname;
    }
    public Account(){
        super();
    }
}