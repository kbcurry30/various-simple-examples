package com.springlight.data.db.model;

public class UnitConfig {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column unit_config.unit_sign
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	private String unitSign;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column unit_config.unit_link
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	private String unitLink;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column unit_config.unit_name
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	private String unitName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column unit_config.unit_sign
	 *
	 * @return the value of unit_config.unit_sign
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	public String getUnitSign() {
		return unitSign;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column unit_config.unit_sign
	 *
	 * @param unitSign
	 *            the value for unit_config.unit_sign
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	public void setUnitSign(String unitSign) {
		this.unitSign = unitSign;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column unit_config.unit_link
	 *
	 * @return the value of unit_config.unit_link
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	public String getUnitLink() {
		return unitLink;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column unit_config.unit_link
	 *
	 * @param unitLink
	 *            the value for unit_config.unit_link
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	public void setUnitLink(String unitLink) {
		this.unitLink = unitLink;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column unit_config.unit_name
	 *
	 * @return the value of unit_config.unit_name
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column unit_config.unit_name
	 *
	 * @param unitName
	 *            the value for unit_config.unit_name
	 *
	 * @mbggenerated Thu Jan 04 18:00:37 CST 2018
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	private Integer unitReadNum;

	private Integer unitClickNum;

	private Integer unitClickBuildNum;

	public Integer getUnitReadNum() {
		return unitReadNum;
	}

	public void setUnitReadNum(Integer unitReadNum) {
		this.unitReadNum = unitReadNum;
	}

	public Integer getUnitClickNum() {
		return unitClickNum;
	}

	public void setUnitClickNum(Integer unitClickNum) {
		this.unitClickNum = unitClickNum;
	}

	public Integer getUnitClickBuildNum() {
		return unitClickBuildNum;
	}

	public void setUnitClickBuildNum(Integer unitClickBuildNum) {
		this.unitClickBuildNum = unitClickBuildNum;
	}

}