package Service;

import Repository.JogadorRepository;
import model.Jogador;

public class JogadorService {

	public Jogador getJogador() {
		JogadorRepository repository = new JogadorRepository();
		return repository.getJogador();
	}

	public void setJogador(Jogador jogador){
		JogadorRepository repository = new JogadorRepository();
		repository.setJogador(jogador);
	}
	
}
