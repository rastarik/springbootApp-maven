package be.bruxelles.ictcg.springbootmaven;

import be.bruxelles.ictcg.springbootmaven.model.Product;
import be.bruxelles.ictcg.springbootmaven.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootApplication
public class SpringbootappApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Page<Product> productPage = productRepository.findAll(PageRequest.of(0,4));

		//System.out.println(productPage.getSize());
		//System.out.println(productPage.getTotalPages());
		//System.out.println(productPage.getTotalElements());
		//System.out.println(productPage.getContent());


	}

	}
