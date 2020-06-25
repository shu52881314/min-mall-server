package com.util;

import lombok.Data;

import java.util.List;
@Data
public class PageData {
    List data;
    Long total;

    public PageData(){

    }

    public PageData(List data, Long total){
        this.data=data;
        this.total=total;
    }

}
