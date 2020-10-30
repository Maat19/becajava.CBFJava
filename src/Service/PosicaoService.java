package Service;

import Repository.PosicaoRepository;
import model.Posicao;

public class PosicaoService {

	public Posicao getPosicao() {
		PosicaoRepository repository = new PosicaoRepository();
		return repository.getPosicao();
	}
	
	public void setPosicao(Posicao posicao) {
		PosicaoRepository repository = new PosicaoRepository();
		repository.setPosicao(posicao);		
	}
}
