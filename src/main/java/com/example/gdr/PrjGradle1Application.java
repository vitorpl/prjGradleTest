package com.example.gdr;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import com.example.gdr.model.Equipamento;
import com.example.gdr.repository.EquipamentoRepository;

@SpringBootApplication
public class PrjGradle1Application {

	public static void main(String[]  args) {
		System.out.println("Testando o gradle no jenkins");
		SpringApplication.run(PrjGradle1Application.class, args);
	}
	
	@Configuration
	public static class ConfiguraProj implements ServletContextInitializer  {

		@Autowired
		EquipamentoRepository repo;
		
		@Value("${ambiente}")
		String ambiente;
		
		@Override
		public void onStartup(ServletContext arg0) throws ServletException {
			// TODO Auto-generated method stub
			System.out.println("INICIALIZANDO DATABASE!");
			
			String amb = ambiente.toUpperCase();
		    
			repo.save( new Equipamento(amb + " - Notebook Lenovo") );
			repo.save( new Equipamento(amb + " - Mouse Topzera") );
			repo.save( new Equipamento(amb + " - Teclado Mecânico Microsoft") );
			repo.save( new Equipamento(amb + " - Monitor Samsung") );
			
			
		}

		
	}

}


