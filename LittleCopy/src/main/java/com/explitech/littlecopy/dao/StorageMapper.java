package com.explitech.littlecopy.dao;

import com.explitech.littlecopy.model.Storage;
import com.explitech.littlecopy.model.StorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int countByExample(StorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int deleteByExample(StorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int deleteByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int insert(Storage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int insertSelective(Storage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    List<Storage> selectByExample(StorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    Storage selectByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int updateByExampleSelective(@Param("record") Storage record, @Param("example") StorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int updateByExample(@Param("record") Storage record, @Param("example") StorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int updateByPrimaryKeySelective(Storage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    int updateByPrimaryKey(Storage record);
}