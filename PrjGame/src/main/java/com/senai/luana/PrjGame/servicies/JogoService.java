package com.senai.luana.PrjGame.servicies;

import java.util.List;


import org.springframework.stereotype.Service;

import com.senai.luana.PrjGame.entitites.Jogo;
import com.senai.luana.PrjGame.repositories.JogoRepository;

@Service
public class JogoService {
	private final JogoRepository jogoRepository;
	
	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository =jogoRepository;
	}
	
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	
	public List<Jogo> getAllJogos(){
		return jogoRepository.findAll();
	}
	
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}
		
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}
}