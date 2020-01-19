package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/1/8 10:59
**/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"controller"})
public class WebMvcConfig implements WebMvcConfigurer {


}
