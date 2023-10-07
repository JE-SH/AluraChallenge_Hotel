package controller;

import dao.HuespedDao;

public class HuespedController {
	
	public Boolean verificarHuesped(Integer id){
		return new HuespedDao().verificarHuesped(id);
	}

}
