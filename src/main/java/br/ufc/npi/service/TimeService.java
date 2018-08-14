package br.ufc.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.npi.bean.Time;
import br.ufc.npi.repository.TimeRepository;

@Service
public class TimeService {
	
	@Autowired
	TimeRepository repo;
	
	public Time salvarTime(String nome) {
		
		Time time = new Time();
		time.setNome(nome);
		repo.save(time);
	
		return time;
	}
	
	public List<Time> getTodosTimes(){
		return repo.findAll();
	}
}
