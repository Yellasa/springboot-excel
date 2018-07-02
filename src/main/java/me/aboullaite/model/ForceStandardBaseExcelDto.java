package me.aboullaite.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.validation.constraints.NotNull;

/**
 * @ClassName: ForceStandardBaseExcelDto
 * @Author: yangting@ty
 * @CreateDate: 2018/6/30 11:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/6/30 11:06
 * @UpdateRemark: 更新说明
 **/
public class ForceStandardBaseExcelDto implements java.io.Serializable
{

    /**
     * 0.9调整系数
     * */
    @Excel(name = "调整系数_0.9",numFormat = "0.00")
    @NotNull(message="存在空值，请检查！")
    private String adjustFactorOne;

    /**
     * 0.85 调整系数
     * */
    @Excel(name = "0.85",numFormat = "0.00")
    @NotNull(message="存在空值，请检查！")
    private String adjustFactorTwo;

    /**
     * 0.80 调整系数
     * */
    @Excel(name = "0.8",numFormat = "0.00")
    @NotNull(message="存在空值，请检查！")
    private String adjustFactorThree;

    public String getAdjustFactorOne()
    {
        return adjustFactorOne;
    }

    public void setAdjustFactorOne(String adjustFactorOne)
    {
        this.adjustFactorOne = adjustFactorOne;
    }

    public String getAdjustFactorTwo()
    {
        return adjustFactorTwo;
    }

    public void setAdjustFactorTwo(String adjustFactorTwo)
    {
        this.adjustFactorTwo = adjustFactorTwo;
    }

    public String getAdjustFactorThree()
    {
        return adjustFactorThree;
    }

    public void setAdjustFactorThree(String adjustFactorThree)
    {
        this.adjustFactorThree = adjustFactorThree;
    }
}
