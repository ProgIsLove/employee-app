//package tom.company.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
//import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
//import org.springframework.web.servlet.resource.PathResourceResolver;
//
//import java.io.IOException;
//import java.lang.reflect.Method;
//
//@Configuration
//@EnableWebMvc
//public class WebConfig implements WebMvcConfigurer, WebMvcRegistrations {
//
//    @Value("${spring.data.rest.base-path}")
//    private String restApiBasePath;
//
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/static/", "/public")
//                .resourceChain(true)
//                .addResolver(new PathResourceResolver() {
//                    @Override
//                    protected Resource getResource(String resourcePath, Resource location) throws IOException {
//                        Resource requestedResource = location.createRelative(resourcePath);
//
//                        return requestedResource.exists() && requestedResource.isReadable() ? requestedResource
//                                : new ClassPathResource("/static/index.html");
//                    }
//                });
//    }
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedMethods("*");
//    }
//
//    @Override
//    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
//        return new RequestMappingHandlerMapping() {
//
//            @Override
//            protected void registerHandlerMethod(Object handler, Method method, RequestMappingInfo mapping){
//                Class<?> beanType = method.getDeclaringClass();
//                RestController restApiController = beanType.getAnnotation(RestController.class);
//                if (restApiController != null) {
//                    PatternsRequestCondition apiPattern = new PatternsRequestCondition(WebConfig.this.restApiBasePath)
//                            .combine(mapping.getPatternsCondition());
//
//                    mapping = new RequestMappingInfo(mapping.getName(), apiPattern,
//                            mapping.getMethodsCondition(), mapping.getParamsCondition(),
//                            mapping.getHeadersCondition(), mapping.getConsumesCondition(),
//                            mapping.getProducesCondition(), mapping.getCustomCondition());
//                }
//
//                super.registerHandlerMethod(handler, method, mapping);
//            }
//        };
//    }
//}
