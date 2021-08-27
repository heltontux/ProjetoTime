package code.com.desafio.appHelton.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	import code.com.desafio.appHelton.model.domain.Time;
import code.com.desafio.appHelton.model.domain.Usuario;
import code.com.desafio.appHelton.model.service.TimeService;
import code.com.desafio.appHelton.model.service.UsuarioService;

	@Controller
	public class UsuarioController {
		
		@Autowired
		public UsuarioService usuarioService;
		
		@GetMapping(value = "/usuario")
		public String telaCadastro() {
			return "usuario/cadastro";
		}
		
		@GetMapping(value = "/usuario/lista")
		public String obterLista(Model model) {
			model.addAttribute("usuarios", usuarioService.obterLista());
			return "usuario/lista";
		}
		
		@PostMapping(value = "/usuario/incluir")
		public String incluir(Model model, Usuario usuario) {
			usuarioService.incluir(usuario);
			model.addAttribute("mensagem", usuario.getNome()+" foi cadastrado com sucesso!!!");
			return obterLista(model);
		}
		
	/*
		@GetMapping(value = "/usuario/{id}/excluir")
		public String excluir(Model model, @PathVariable Integer id) {
			Time timeExcluido = timeService.obterPorId(id);
			timeService.excluir(id);
			model.addAttribute("mensagem", "Time "+timeExcluido.getNome()+" excluido com sucesso!!!");
			return obterLista(model);
		}
		
		@GetMapping(value = "/time/{id}/consultar")
		public String consultar(Model model, @PathVariable Integer id) {
			Time time = timeService.obterPorId(id);
			model.addAttribute("meuTime", time);
			return telaCadastro();
		}
		
		@GetMapping(value = "/voltar")
		public String voltar() {
			return "redirect:/time/lista";
		}
		
		@PostMapping(value = "/time/ordenar")
		public String ordenar(Model model, @RequestParam String sortBy) {
			model.addAttribute("times", timeService.obterLista(sortBy));
			return "time/lista";
		}
		*/
	}
