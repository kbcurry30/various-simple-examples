package com.example.demo.db.dao;

import com.example.demo.db.model.TbcTelphone;

public interface TbcTelphoneMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_telphone
	 *
	 * @mbggenerated Wed Feb 07 19:37:34 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_telphone
	 *
	 * @mbggenerated Wed Feb 07 19:37:34 CST 2018
	 */
	int insert(TbcTelphone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_telphone
	 *
	 * @mbggenerated Wed Feb 07 19:37:34 CST 2018
	 */
	int insertSelective(TbcTelphone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_telphone
	 *
	 * @mbggenerated Wed Feb 07 19:37:34 CST 2018
	 */
	TbcTelphone selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_telphone
	 *
	 * @mbggenerated Wed Feb 07 19:37:34 CST 2018
	 */
	int updateByPrimaryKeySelective(TbcTelphone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_telphone
	 *
	 * @mbggenerated Wed Feb 07 19:37:34 CST 2018
	 */
	int updateByPrimaryKey(TbcTelphone record);

	/**
	 * 根据手机号码查询数据
	 * 
	 * @param phone
	 * @return
	 */
	TbcTelphone selectByTel(String phone);
}