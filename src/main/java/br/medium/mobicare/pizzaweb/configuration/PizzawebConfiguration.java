package br.medium.mobicare.pizzaweb.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootConfiguration
@ComponentScan(basePackages = {"br.medium.mobicare"})
public class PizzawebConfiguration {

}
