package com.clonecoding.myapp.main.mainDao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.clonecoding.myapp.main.VO.Greeting;

@Repository
@Mapper
public interface MainMapper {
	List<Greeting> selectTest();
}
