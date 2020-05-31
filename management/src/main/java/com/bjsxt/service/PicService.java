package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.Pic;

/**
 * @author wanglimin
 * @date 2020年4月5日 下午12:35:59
 *
 */
public interface PicService {
	int insPic(Pic pic);
	
	List<Pic> show();
	int delById(int id);
}
