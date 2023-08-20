package org.hcl;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.webflow.config.AbstractFlowConfiguration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.engine.builder.support.FlowBuilderServices;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.mvc.builder.MvcViewFactoryCreator;

@Configuration
public class WebFlowConfig extends AbstractFlowConfiguration {

   // @Autowired
   //private WebMvcConfig webMvcConfig;

    @Bean
    public FlowDefinitionRegistry flowRegistry() {
    	return getFlowDefinitionRegistryBuilder() //
				.setBasePath("classpath:flows") //
				.addFlowLocationPattern("/**/*-flow.xml") //
				.setFlowBuilderServices(this.flowBuilderServices()) //
				.build();
    }

    @Bean
    public FlowExecutor flowExecutor() {
        return getFlowExecutorBuilder(this.flowRegistry()).build();
    }

    @Bean
    public FlowBuilderServices flowBuilderServices() {
        return getFlowBuilderServicesBuilder()
          .setViewFactoryCreator(mvcViewFactoryCreator())
          .setDevelopmentMode(true).build();
    }

    @Bean
    public MvcViewFactoryCreator mvcViewFactoryCreator() {
        MvcViewFactoryCreator factoryCreator = new MvcViewFactoryCreator();
       // factoryCreator.setViewResolvers(
       //   Collections.singletonList(this.webMvcConfig.viewResolver()));
        factoryCreator.setDefaultViewSuffix("Hello");
      //  factoryCreator.setViewResolvers(Collections.singletonList(this.thymeleafViewResolver()));
        factoryCreator.setUseSpringBeanBinding(true);
        return factoryCreator;
    }
   /* @Description("Thymeleaf AJAX view resolver for Spring WebFlow")
    public AjaxThymeleafViewResolver thymeleafViewResolver() {
        AjaxThymeleafViewResolver viewResolver = new AjaxThymeleafViewResolver();
        viewResolver.setViewClass(FlowAjaxThymeleafView.class);
        viewResolver.setTemplateEngine(this.templateEngine());
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }

 

    @Bean
    @Description("Thymeleaf template resolver serving HTML 5")
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("templates/");
        templateResolver.setCacheable(false);
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }

 

    @Bean
    @Description("Thymeleaf template engine with Spring integration")
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(this.templateResolver());
        return templateEngine;
    }
	private Object thymeleafViewResolver() {
		// TODO Auto-generated method stub
		return null;
	}*/
}