package com.example.demo.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.db.model.TbcBtnCount;

public interface TbcBtnCountMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_btn_count
	 *
	 * @mbggenerated Wed Feb 07 21:17:26 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_btn_count
	 *
	 * @mbggenerated Wed Feb 07 21:17:26 CST 2018
	 */
	int insert(TbcBtnCount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_btn_count
	 *
	 * @mbggenerated Wed Feb 07 21:17:26 CST 2018
	 */
	int insertSelective(TbcBtnCount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_btn_count
	 *
	 * @mbggenerated Wed Feb 07 21:17:26 CST 2018
	 */
	TbcBtnCount selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_btn_count
	 *
	 * @mbggenerated Wed Feb 07 21:17:26 CST 2018
	 */
	int updateByPrimaryKeySelective(TbcBtnCount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tbc_btn_count
	 *
	 * @mbggenerated Wed Feb 07 21:17:26 CST 2018
	 */
	int updateByPrimaryKey(TbcBtnCount record);
	
	
	int updateForBtnCount(@Param("btnClass") String btnClass);

	/**
	 * 查询所有按钮信息
	 * 
	 * @return
	 */
	List<TbcBtnCount> selectAllMes();
}