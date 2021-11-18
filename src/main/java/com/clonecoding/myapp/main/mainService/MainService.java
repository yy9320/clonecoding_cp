package com.clonecoding.myapp.main.mainService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clonecoding.myapp.main.VO.Greeting;
import com.clonecoding.myapp.main.mainDao.MainMapper;

@Service
public class MainService {
	@Autowired
	public MainMapper mapper;
	
	public List<Greeting> selectTest() {
		return mapper.selectTest();
	}
}
