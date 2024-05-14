package com.dao;

import com.entity.JiatingjiyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiatingjiyuView;

/**
 * 家庭寄语 Dao 接口
 *
 * @author 
 */
public interface JiatingjiyuDao extends BaseMapper<JiatingjiyuEntity> {

   List<JiatingjiyuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
