package me.aboullaite.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;

import javax.validation.constraints.NotNull;

/**
 * @author 杨霆
 * @version 创建时间：Jun 28, 2018 8:46:58 PM
 * 力调导入类
 */
public class ForceStandardDetailExcelDto  implements java.io.Serializable{

	/**
	 * 力调标准code
	 * */
	private String standardCode;

	/**
	 * 版本说明
	 * */
	private String versionDesc;

	/**
	 * 功率因数
	 * */
	@Excel(name = "功率因数",needMerge = true,orderNum = "1",numFormat = "0.00")
	@NotNull(message = "功率因数存在缺失数据，请检查！")
	private String powerFactor;

	@ExcelEntity(name = "调整系数")
	private ForceStandardBaseExcelDto baseDto;


	public String getStandardCode()
	{
		return standardCode;
	}

	public void setStandardCode(String standardCode)
	{
		this.standardCode = standardCode;
	}

	public String getVersionDesc()
	{
		return versionDesc;
	}

	public void setVersionDesc(String versionDesc)
	{
		this.versionDesc = versionDesc;
	}

	public String getPowerFactor()
	{
		return powerFactor;
	}

	public void setPowerFactor(String powerFactor)
	{
		this.powerFactor = powerFactor;
	}

	public ForceStandardBaseExcelDto getBaseDto()
	{
		return baseDto;
	}

	public void setBaseDto(ForceStandardBaseExcelDto baseDto)
	{
		this.baseDto = baseDto;
	}

	@Override
	public String toString()
	{
		return "ForceStandardDetailExcelDto{" +
				"standardCode='" + standardCode + '\'' +
				", versionDesc='" + versionDesc + '\'' +
				", powerFactor='" + powerFactor + '\'' +
				'}';
	}
}
