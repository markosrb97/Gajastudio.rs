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
	
	/*
	  @Bean
	  public CommandLineRunner demo(CandleRepository repository) {
	    return (args) -> {
	      
	      repository.save(new Candle("Ljubav i strast", 1000, "Da li vam fali, ili samo\r\n" + 
											      		"želite više ljubavi i strasti u vašem životu? Ako je odgovor da, onda će vam ova\r\n" + 
											      		"sveća pomoći u tome.\r\n" + 
											      		"\r\n" + 
											      		"Uz naš preporučeni ritual koji dobijate uz sveću oplemenićete vaš život iskrenim\r\n" + 
											      		"osećanjima zahvalnosti i ljubavi, ali i strasti prema životu. Privucite sebi ljubav\r\n" + 
											      		"koju već zaslužujete, i koja čeka da se desi. Probudite strast u vašem životu.\r\n" + 
											      		"\r\n" + 
											      		"Napravljena je od prehrambenog parafinskog voska, sa mirisnim notama nežnog\r\n" + 
											      		"poljskog cveća. Ukrašena je laticama ruže koje dodaju ljubavnu i magijsku energiju\r\n" + 
											      		"ovoj sveći."));
	      repository.save(new Candle("Duboki mir", 1000, "Ova sveća je inspirisana osećajem\r\n" + 
											      		"dubokog mira i spokoja koji svi težimo da postignemo. Uz sveću dobijate\r\n" + 
											      		"preporučeni ritual, tačnije uputstvo. Ritual za ovu sveću je vrsta meditacije, koja\r\n" + 
											      		"će vas lako uvesti u svet meditiranja i blagostanja.\r\n" + 
											      		"Ukoliko ako želite da oplemenite vaš život i dnevnu rutinu, ili ste često nervozni,\r\n" + 
											      		"pod stresom ili anksiozni, ova sveća je pravi izbor za vas.\r\n" + 
											      		"\r\n" + 
											      		"Napravljena je od prehrambenog parafinskog voska, sa mirisnim notama poljskog\r\n" + 
											      		"cveća i lavande. Ukrašena je lavandom koja se oduvek koristi za smirenje, osećaje\r\n" + 
											      		"mira i spokoja, miran san i meditaciju."));
	      repository.save(new Candle("Čišćenje negativne energije", 1000, "Ako imate suviše negativne energije u životu, ako uvek prvo razmišljate negativno ili ako ste okruženi negativnim ljudima a želite to da promenite ova sveća je za vas.\r\n" + 
											      		"\r\n" + 
											      		"Ova sveća je savršena za okretanje ka pozitivnoj strani i menjanje vaše realnosti iz negativnih obrazaca u pozitivne. Ritual koji dobijate uz sveću će vam pomoći da iskoristite pun potencijal ove sveće i izbacite svu negativu energiju iz vašeg života, u kojoj god sferi da se nalazi.\r\n" + 
											      		"\r\n" + 
											      		"Napravljena je od prehrambenog parafinskog voska, sa mirisnim notama poljskog cveća. Ukrašena je žalfijom i crnom soli. Žalfija je moćna biljka koja pomaže čišćenju toksina, dizanju vibracija, pročišćenju atmosfere. Koristi se i za zaštitu. So se takođe koristi za navedene radnje i upija svu negativnu energiju i loše namere. So i žalfija čine ovu sveću izuzetno moćnom.\r\n" + 
											      		"\r\n" + 
											      		""));
	      repository.save(new Candle("Mlad mesec", 1000, "Kako je mlad mesec početak ciklusa, tako je taj period savršen za počinjanje svega novog, postavljanje ciljeva i vizuelizaciju i meditiranje u svrsi novih početaka. U ovo vreme iskoristite energiju mladog meseca za samoreflekciju, nove ciljeve i želje i za nov početak.\r\n" + 
											      		"\r\n" + 
											      		"\r\n" + 
											      		"Napravljena je od prehrambenog parafinskog voska, sa mirisnim notama poljskog cveća. Ukrašena je pelenom i cvetom lipe. Lipa se koristi za otpuštanje nepotrebnog i za jačanje energija manifestovanja, dok se biljka pelen koristi u magijskim ritualima za čišćenje, za vidovitost, lucidne snove i dr. To čini ove dve biljke veoma potentnim dodacima sveći."));
	      repository.save(new Candle("Pun mesec", 1000, "Pun mesec je savršeno vreme za otpuštanje svega suvišnog, za čišćenje ustajale energije i energetsko ,,punjenje baterija’’. Ovaj potentan period svi osećamo i ova sveća, i ritual koji dobijate uz nju će vam pomoći da ga kanališete i radite sa moći punog meseca.\r\n" + 
											      		"\r\n" + 
											      		"\r\n" + 
											      		"Napravljena je od prehrambenog parafinskog voska, sa mirisnim notama poljskog cveća. Ukrašena je cvetovima jasmina. Biljkom jasmin vlada mesec i veruje se da je savršena za magiju meseca. Takođe se veruje da pomaže u ljubavi, spiritualnom putu i prosperitetu."));
	      repository.save(new Candle("Prosperitet", 1000, "Ako želite više uspeha, novca i izobilja u vašem životu onda je ova sveća pravi izbor za vas.\r\n" + 
											      		"\r\n" + 
											      		"Preporučeni ritual koji dobijate će vam pomoći da budete uspešniji i bogatiji\r\n" + 
											      		"spiritualno i materijalno. Bogatstvo i izobilje je stanje uma. Ako verujete da\r\n" + 
											      		"zaslužujete da budete uspešni i živite u izobilju, tako će i biti. Naša planeta i\r\n" + 
											      		"univerzum beskonačno stvara i daje, iskoristite tu energiju izobilja uz pomoć ove\r\n" + 
											      		"sveće.\r\n" + 
											      		"Napravljena je od prehrambenog parafinskog voska, sa mirisnim notama poljskog\r\n" + 
											      		"cveća. Ukrašena je zlatnim listićima i hajdučkom travom. Za hajdučku travu se\r\n" + 
											      		"veruje da daje potrebnu hrabrost i snagu svakome ko je koristi, i zato ide savršeno\r\n" + 
											      		"uz namenu ove sveće."));
	      repository.save(new Candle("Pozitivna energija", 1000, "Obogatite vaš dom i vaš život pozitivnim vibracijama. Uz sveću ćete dobiti\r\n" + 
													      		"preporučeni ritual. Uputstvo koje dobijate će vam pomoći da iskoristite\r\n" + 
													      		"maksimalni potencijal sveće, ali i vas samih. Nakon našeg rituala imaćete osećaj\r\n" + 
													      		"blagostanja, sreće i zahvalnosti.\r\n" + 
													      		"\r\n" + 
													      		"Napravljena je od prehrambenog parafinskog voska, sa mirisnim notama poljskog\r\n" + 
													      		"cveća i limuna. Ukrašena je ruzmarinom za koji se veruje da poseduje moći\r\n" + 
													      		"manifestovanja, pozitivne energije i vezuje se za sunčevu energiju."));
	      repository.save(new Candle("Manifestovanje", 1000, "Da li želite da manifestujete vaš idealan život? Ova sveća vam pomaže u tome. Svako od nas ima tu moć u sebi. Potrebno je da je pokrente.\r\n" + 
											      		"\r\n" + 
											      		" Uz naš preporučeni ritual, tačnije uputstvo koje dobijate uz sveću, kao i uz savete možete naučiti da kanališete moć koja se već nalazi u vama. Svako od vas je u stanju da je iskoristi i  manifestuje sve što poželi.  \r\n" + 
											      		"\r\n" + 
											      		"Napravljena je od prehrambenog parafinskog voska, sa mirisnim notama poljskog cveća. Ukrašena je zvezdastim anisom, čije su glavne energetske karakteristike donošenje moći, manifestovanje i privlačenje. Ove osobine dodaju moć ovoj sveći i pomažu vama u ritualima manifestovanja.\r\n" + 
											      		"\r\n" + 
											      		""));

	    };
	  }
	  
	 */
}
