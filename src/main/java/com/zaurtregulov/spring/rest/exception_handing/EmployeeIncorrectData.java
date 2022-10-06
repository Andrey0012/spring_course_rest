package com.zaurtregulov.spring.rest.exception_handing;

public class EmployeeIncorrectData {
    public String info;

    public EmployeeIncorrectData() {
    }

    public EmployeeIncorrectData(String info) {
        this.info = info;
    }

    public String getInfo(String message) {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
