package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.PicMapper;
import com.bjsxt.pojo.Pic;
import com.bjsxt.service.PicService;

/**
 * @author wanglimin
 * @date 2020年4月5日 下午12:36:47
 *
 */
@Service
public class PicServiceImpl implements PicService{
	@Resource
	private PicMapper picMapper;
	@Override
	public int insPic(Pic pic) {
		return picMapper.insPic(pic);
	}
	@Override
	public List<Pic> show() {
		return picMapper.selAll();
	}
	@Override
	public int delById(int id) {
		return picMapper.delById(id);
	}

}
