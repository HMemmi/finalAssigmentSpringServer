package se.kth.assigment;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * This method is the servlet config of the server
 * @author Hichem Memmi
 * @version 30/04/2017
 *
 */

@Configuration
//EnabledWebMvc which tell to springframework that this project is annotation driver
@EnableWebMvc
//ComponentScan which tell where to search after annotations
@ComponentScan(basePackages = "se.kth.assigment")
public class WebConfig {

}
