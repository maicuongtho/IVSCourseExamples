package ivs.configs;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 
 
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
 
   // Cấu hình để sử dụng các file nguồn tĩnh (html, image, ..)
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/").setCachePeriod(31556926);
       registry.addResourceHandler("/img/**").addResourceLocations("/resources/img/").setCachePeriod(31556926);
       registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/").setCachePeriod(31556926);
   }
 
    
    
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
   }
 
}