package code.com.desafio.appHelton.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import code.com.desafio.appHelton.model.domain.Time;
import code.com.desafio.appHelton.model.domain.Usuario;
import code.com.desafio.appHelton.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> obterLista(){
		return (List<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public List<Usuario> obterLista(String campo){
		return (List<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, campo));
		
	}
	
	  public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	  
	  public Usuario obterPorId(Integer id) {
			return usuarioRepository.findById(id).orElse(null);
		}
	
	/*
	public void excluir(Integer id) {
		timeRepository.deleteById(id);
	}

}

	 */
	
}
