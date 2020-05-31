package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.Pic;

/**
 * @author wanglimin
 * @date 2020年4月5日 下午12:32:56
 *
 */
public interface PicMapper {
	int insPic(Pic pic);
	
	@Select("select * from pic")
	List<Pic> selAll();
	
	@Delete("delete from pic where id=#{0}")
	int delById(int id);
}
