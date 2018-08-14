package br.ufc.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.npi.bean.Jogador;
import br.ufc.npi.repository.JogadorRepository;

@Service
public class JogadorService {
	
	@Autowired 
	JogadorRepository repo;
	
	public Jogador salvarJogador(String nome, int idade) {
		
		Jogador jogador = new Jogador();
		jogador.setIdade(idade);
		jogador.setNome(nome);
		repo.save(jogador);
		
		return jogador;
	}
	
	public List<Jogador> getTodosJogadores(){
		return repo.findAll();
	}
}
