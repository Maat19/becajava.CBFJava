package Service;

import Repository.PartidaRepository;
import model.Partida;

public class PartidaService {

	public Partida getPartida() {
		PartidaRepository repository = new PartidaRepository();
		return repository.getPatida();
	}
	
	public void setPartida (Partida partida) {
		PartidaRepository repository =new PartidaRepository();
		repository.SetPartida(partida);
	}
}
