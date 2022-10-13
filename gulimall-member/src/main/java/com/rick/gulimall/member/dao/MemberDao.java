package com.rick.gulimall.member.dao;

import com.rick.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 20:53:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
