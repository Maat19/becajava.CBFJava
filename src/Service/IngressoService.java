package Service;

import Repository.IngressoRepository;
import model.Ingresso;

public class IngressoService {

	public Ingresso getIngresso() {
		IngressoRepository repository = new IngressoRepository();
		return repository.getIngresso();
	}
	
	public void setIngresso(Ingresso ingresso) {
		IngressoRepository repository = new IngressoRepository();
		repository.setIngresso(ingresso);		
	}
}
