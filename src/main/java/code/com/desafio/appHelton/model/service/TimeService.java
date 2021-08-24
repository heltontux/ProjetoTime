package code.com.desafio.appHelton.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import code.com.desafio.appHelton.model.domain.Time;
import code.com.desafio.appHelton.model.repository.TimeRepository;

@Service
public class TimeService {
	
	@Autowired
	private TimeRepository timeRepository;

	public List<Time> obterLista(){
		return (List<Time>) timeRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
		
	}
	
	public List<Time> obterLista(String campo){
		return (List<Time>) timeRepository.findAll(Sort.by(Sort.Direction.ASC, campo));
		
	}
	
	public void incluir(Time time) {
		timeRepository.save(time);
	}
	
	public void excluir(Integer id) {
		timeRepository.deleteById(id);
	}
	
	public Time obterPorId(Integer id) {
		return timeRepository.findById(id).orElse(null);
	}
}
