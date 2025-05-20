package cn.hots.icas.clmlogic.common.dto;

import java.io.Serializable;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/8 10:28
 */
public class HeadVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer curNum;
    private Integer totalNum;
    private Integer pageNum;
    private String hasNext;
    private String retMsg;

    public Integer getCurNum() {
        return curNum;
    }

    public void setCurNum(Integer curNum) {
        this.curNum = curNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getHasNext() {
        return hasNext;
    }

    public void setHasNext(String hasNext) {
        this.hasNext = hasNext;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
