package eblue.hub.eblue.hub;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.pattern.PathPatternParser;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EBlueHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBlueHubApplication.class, args);
	}

//	@Bean
@Bean
public WebMvcConfigurer corsConfigurer() {
	return new WebMvcConfigurerAdapter() {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/Species/all").allowedOrigins("http://localhost:4200");
		}
	};
}
//	public CorsFilter corsFilter() {
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.setAllowCredentials(true);
//		corsConfiguration.setAllowedOrigins(List.of("http://localhost:4200"));
//		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin","Content-Type",
//				"Accept","Authorization","Origin","Accept","X-Request-With",
//				"Access-Control-Request-Method", "Access-Control-Request-Headers","Access-Control-Allow-Origin"));
//		corsConfiguration.setExposedHeaders(Arrays.asList("Origin","Content-Type","Accept","Authorization",
//				"Access-Control-Allow-Origin","Access-Control-Allow-Origin","Access-Control-Allow-Credentials"));
//		corsConfiguration.addAllowedMethod(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS").toString());
//		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//		return new CorsFilter(urlBasedCorsConfigurationSource);
//	}
}
