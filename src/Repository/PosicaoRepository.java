package Repository;

import java.util.ArrayList;
import java.util.List;

import model.Posicao;

public class PosicaoRepository {

	public List<Posicao> listaPosicao = new ArrayList<Posicao>();
	
	public Posicao getPosicao() {
		return new Posicao();
	}
	
	public List<Posicao> GetAllPosicao(){
		return new ArrayList<Posicao>();
		
	}
	
	public void setPosicao(Posicao posicao) {
		
		
	}
	
}
