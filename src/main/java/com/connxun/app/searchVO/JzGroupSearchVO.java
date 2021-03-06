package com.connxun.app.searchVO;

import io.swagger.annotations.ApiParam;

/**
 * Created by anna on 2017-09-27.
 */
public class JzGroupSearchVO extends CommonSearchVO {

    @ApiParam("群组ID")
    private String groupNo;
    @ApiParam("群组名称")
    private String groupName;


    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getGroupName() {
        return groupName;
    }
    public String getGroupNameParam() {
        return "%"+groupName+"%";
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
