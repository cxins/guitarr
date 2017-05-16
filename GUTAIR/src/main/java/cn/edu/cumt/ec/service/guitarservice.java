package cn.edu.cumt.ec.service;

import java.util.List;

import cn.edu.cumt.ec.dao.guitardaojdbc;
import cn.edu.cumt.ec.entity.GuitarSpec;
import cn.edu.cumt.ec.entity.guitar1;


public class guitarservice {
	private guitardaojdbc guitarDao=new guitardaojdbc();
	
	public List<guitar1> CHAXUN(GuitarSpec spec) {
		// TODO Auto-generated method stub
		return guitarDao.CHAXUN(spec);
	}

	public guitardaojdbc getGuitarDaoImpl() {
		return guitarDao;
	}

	public void setGuitarDaoImpl(guitardaojdbc guitarDaoImpl) {
		this.guitarDao = guitarDaoImpl;
	}

}