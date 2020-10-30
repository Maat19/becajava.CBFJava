package Service;

import Repository.ClubeRepository;
import model.Clube;

public class ClubeService {

	public Clube getClube() {
		ClubeRepository repository = new ClubeRepository();
		return repository.getClube();
	}
	
	public void setCube(Clube clube) {
		ClubeRepository repository = new  ClubeRepository();
		repository.setClube(clube);
	}
}
