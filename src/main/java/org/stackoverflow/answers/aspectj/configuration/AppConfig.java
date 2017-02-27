package org.stackoverflow.answers.aspectj.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.stackoverflow")
@EnableAspectJAutoProxy
public class AppConfig {

}
