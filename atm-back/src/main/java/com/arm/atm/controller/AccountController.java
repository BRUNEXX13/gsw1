package com.arm.atm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
@RequestMapping(value = "/account")
public class AccountController {
	
//	
//
//		@Autowired
//		private AccountService accountsService;
//
//		// GET obtem Recursos
//		@RequestMapping(method = RequestMethod.GET)
//		public ResponseEntity<List<Account>> listar() {
//
//			// Fazendo o tratamento de Mensagens dos códigos
//			return ResponseEntity.status(HttpStatus.OK).body(accountsService.listar());
//
//		}
//
//		// Post - Metodo para Criacao de Recursos
//		@RequestMapping(method = RequestMethod.POST)
//		public ResponseEntity<Void> salvar(@Valid @RequestBody Account account) {
//			account = account.salvar(account);
//
//			// Retornando a URI onde o recurso pode ser localizado = Location
//			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(account.getId()).toUri();
//
//			// Retorno da URI
//			return ResponseEntity.created(uri).build();
//		}
//
//		// Fazendo a Busca atraves de um id Especifico //
//		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//		public ResponseEntity<?> buscar(@PathVariable("id") Long id) {
//			Account account = accountsService.buscar(id);
//
//			// Tempo de Inforomacao Valida no nosso Listar por ID 
//			CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);
//
//			return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(livro);
//		}
//
//		// Deletando um Livro by id
//		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//		public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
//			accountsService.deletar(id);
//			return ResponseEntity.noContent().build();
//
//		}
//
//		@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//		public ResponseEntity<Void> atualizar(@RequestBody Livro livro, @PathVariable("id") Long id) {
//		    accountsService.setId(id);
//			accountsService.atualizar(livro);
//			return ResponseEntity.noContent().build();
//			// Tratando o metodo caso tenta atualizar um valor que nao existe.
//
//		}
//
//		@RequestMapping(value = "/{id}/saldos", method = RequestMethod.POST)
//		public ResponseEntity<Void> adicionarSaldo(@PathVariable("id") Long livroId, @RequestBody Saldo saldo) {
//			
//			//Captura o Usuario e o contexto atual de seguranca
//			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//			
//			//Capturando o Usuário quando ele fizer um comentário.
//			comentario.setUsuario(auth.getName());
//
//			livrosService.salvarComentario(livroId, comentario);
//
//			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
//
//			// Retorno da URI
//			return ResponseEntity.created(uri).build();
//
//		}
//		
//		@RequestMapping(value = "/{id}/comentarios", method = RequestMethod.GET)
//		public ResponseEntity<List<Comentario>> listarComentarios(@PathVariable("id") Long livroId) {
//			List<Comentario> comentarios = livrosService.listarComentario(livroId);
//
//			return ResponseEntity.status(HttpStatus.OK).body(comentarios);
//
//		}
//	}
//
}
