package com.maximizesistemas.atendebemws.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.entities.Atividade;
import com.maximizesistemas.atendebemws.entities.Avalia;
import com.maximizesistemas.atendebemws.entities.Cliente;
import com.maximizesistemas.atendebemws.entities.Despesa;
import com.maximizesistemas.atendebemws.entities.DespesaAt;
import com.maximizesistemas.atendebemws.entities.ParcelaAt;
import com.maximizesistemas.atendebemws.entities.Produto;
import com.maximizesistemas.atendebemws.entities.ProdutoAt;
import com.maximizesistemas.atendebemws.entities.Servico;
import com.maximizesistemas.atendebemws.entities.Usuario;
import com.maximizesistemas.atendebemws.enums.AtendimentoStatus;
import com.maximizesistemas.atendebemws.repositories.AtendimentoRepository;
import com.maximizesistemas.atendebemws.repositories.AtividadeRepository;
import com.maximizesistemas.atendebemws.repositories.AvaliaRepository;
import com.maximizesistemas.atendebemws.repositories.ClienteRepository;
import com.maximizesistemas.atendebemws.repositories.DespesaAtRepository;
import com.maximizesistemas.atendebemws.repositories.DespesaRepository;
import com.maximizesistemas.atendebemws.repositories.ParcelaAtRepository;
import com.maximizesistemas.atendebemws.repositories.ProdutoAtRepository;
import com.maximizesistemas.atendebemws.repositories.ProdutoRepository;
import com.maximizesistemas.atendebemws.repositories.ServicoRepository;
import com.maximizesistemas.atendebemws.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private AtendimentoRepository atendimentoRepository;
	
	@Autowired
	private AvaliaRepository avaliaRepository;
	
    @Autowired
    private DespesaAtRepository despesaAtRepository;
    
    @Autowired
    private AtividadeRepository atividadeRepository;
    
    @Autowired
    private ParcelaAtRepository parcelaAtRepository;
    
    @Autowired
    private ProdutoAtRepository produtoAtRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// Tudo que estiver aqui será executada quando a aplicação for iniciada.
		Usuario u1 = new Usuario("1", "Maria Brown", "maria@gmail.com", "123456", 1);
		Usuario u2 = new Usuario("2", "Alex Green", "alex@gmail.com", "123456", 1); 
		
		Servico s1 = new Servico(1L, u1, 0, "Teste Serviço", 1, 10.00f, 1);
				
		Despesa d1 = new Despesa(1L, u1, 0, "Teste Despesa", 10F, 1, 0, 0);
		
		Cliente c1 = new Cliente(1L,u1, 0, null, 1, 1L, 0, 
				"Maria", null, null, 0, null, null, 99777494L, 999777494L,
				null, 1, "maria@gmail.com", null, null, 0f, null);
				
		Instant now = Instant.now();	
		Atendimento a1 = new Atendimento(1L, u1, 0, AtendimentoStatus.ABERTURA, c1, null,
				null, null, "Teste", "Teste", 0f,
				0f, 0f, 0f, 0f, 0f, 
				0f, 0, 1L, 30, 0f, 0,
				now);
		
		Avalia v1 = new Avalia(4, "maria@gmail.com", "Otimo app");

		Produto p1 = new Produto(1L, u1, 0, null, 1, "Teste Produto", "Tipo", "fornec", 0, 0F, 0F, null);

		
		DespesaAt da1 = new DespesaAt(1L, 0, a1, d1, null, "teste",
				0, 0, 0f, 0, 0f, 0f);
	
		
		Atividade at1 = new Atividade(1L, 0, a1, s1, null,
				null, "Teste", null, 0, 0, 0,
				0f, 0f);
	
		Atividade at2 = new Atividade(2L, 0, a1, s1, null,
				null, "Teste 2", null, 0, 0, 0,
				0f, 0f);
				
		
		ParcelaAt pa1 = new ParcelaAt(1L, 0, a1, 1, null, 1L
				, 0f, null, 0f, 0);
	
		
        ProdutoAt pr1 = new ProdutoAt(1L, 0, a1, p1, 0f, 0f, 0f, 0f, 0f, 0f);
	
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		servicoRepository.saveAll(Arrays.asList(s1));
		produtoRepository.saveAll(Arrays.asList(p1));
		clienteRepository.saveAll(Arrays.asList(c1));
		despesaRepository.saveAll(Arrays.asList(d1));
		atendimentoRepository.saveAll(Arrays.asList(a1));
		parcelaAtRepository.saveAll(Arrays.asList(pa1));
		avaliaRepository.saveAll(Arrays.asList(v1));
		produtoAtRepository.saveAll(Arrays.asList(pr1));
		atividadeRepository.saveAll(Arrays.asList(at1, at2));
        despesaAtRepository.saveAll(Arrays.asList(da1));
        
	}
	
	

}
