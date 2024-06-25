package com.dao;

import com.entity.WenzhangleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhangleixingVO;
import com.entity.view.WenzhangleixingView;


/**
 * 文章类型
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface WenzhangleixingDao extends BaseMapper<WenzhangleixingEntity> {
	
	List<WenzhangleixingVO> selectListVO(@Param("ew") Wrapper<WenzhangleixingEntity> wrapper);
	
	WenzhangleixingVO selectVO(@Param("ew") Wrapper<WenzhangleixingEntity> wrapper);
	
	List<WenzhangleixingView> selectListView(@Param("ew") Wrapper<WenzhangleixingEntity> wrapper);

	List<WenzhangleixingView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhangleixingEntity> wrapper);
	
	WenzhangleixingView selectView(@Param("ew") Wrapper<WenzhangleixingEntity> wrapper);
	
}
