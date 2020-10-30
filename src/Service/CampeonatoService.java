package Service;

import Repository.CampeonatoRepository;
import model.Campeonato;

public class CampeonatoService {

	public Campeonato getCampeoanto() {
		CampeonatoRepository repository = new CampeonatoRepository();
		return repository.getCampeonato();	
	}
	
	public void setCampeonato(Campeonato campeonato) {
		CampeonatoRepository repository = new CampeonatoRepository();
		repository.setCampeonato(campeonato);
	}
}
