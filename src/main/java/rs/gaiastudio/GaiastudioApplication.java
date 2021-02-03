package rs.gaiastudio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import rs.gaiastudio.model.Candle;
import rs.gaiastudio.repo.CandleRepository;

@SpringBootApplication
public class GaiastudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaiastudioApplication.class, args);
	}
	
	
	//testiranje baze...
	  @Bean
	  public CommandLineRunner demo(CandleRepository repository) {
	    return (args) -> {
	      repository.save(new Candle("Ljubav i strast", 1000));
	      repository.save(new Candle("Duboki mir", 1000));
	      repository.save(new Candle("Čišćenje negativne energije", 1000));
	      repository.save(new Candle("Mlad mesec", 1000));
	      repository.save(new Candle("Pun mesec", 1000));
	      repository.save(new Candle("Prosperitet", 1000));
	      repository.save(new Candle("Pozitivna energija", 1000));
	      repository.save(new Candle("Manifestovanje", 1000));
	      
	    };
	  }

}
