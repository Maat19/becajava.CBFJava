package Repository;

import java.util.ArrayList;
import java.util.List;

import model.Jogador;

public class JogadorRepository {

	public List<Jogador> listaJogador = new ArrayList<Jogador>();
	
	public Jogador getJogador() {
		return new Jogador();
	}
	
	public List<Jogador> GetAllJogador(){
		return new ArrayList<Jogador>();
	}
	
	public void setJogador(Jogador jogador) {
		
	}
}

