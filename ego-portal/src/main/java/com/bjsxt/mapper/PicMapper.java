package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.Pic;

/**
 * @author wanglimin
 * @date 2020年4月5日 下午8:15:01
 *
 */
public interface PicMapper {
	@Select("select * from pic")
	List<Pic> selAll();
}
