package com.alibaba.haven01.param;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author shenmeng
 * @Date 2020-04-30
 **/
@Data
@AllArgsConstructor
public class PageParamDTO implements Serializable {

    private static final long serialVersionUID = -6741865083430643773L;

    private Integer limit;

    private Integer offset;

    public Integer getLimit() {
        return limit==null?1000:limit;
    }

    public Integer getOffset() {
        return offset==null?0:offset;
    }

    public Integer getPageNum(){
        Integer limit = this.getLimit();
        Integer offset = this.getOffset();
        return (offset/limit)+1;
    }

    public PageParamDTO() {
        this.offset=0;
        this.limit=1000;
    }
}
