package Cliente.ClienteConsulta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = "Cliente.ClienteConsults")
public class ClienteConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteConsultaApplication.class, args);

	}

}
