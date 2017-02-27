package org.stackoverflow.answers.aspectj.configuration;

import java.util.Collection;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.stackoverflow.answers.aspectj.domain.LanguageI;

@Aspect
@Component
public class LanguageAspect
{
    @AfterReturning(
            // pointcut = "execution(* org.stackoverflow..*(..))",
            // This only affects the interface
            // value = "execution(* org.stackoverflow.*.*.*.*.getLanguage(..))",
            // value = "execution(* org.stackoverflow.*.*.*.*.*(..))",
            pointcut = "execution(* *(..))" , returning = "language" )
    public void sayHello( LanguageI language )
    {
        language.sayHello( );
    }

    @AfterReturning( pointcut = "execution(* *(..))" , returning = "languages" )
    public void sayHelloEverybody( Collection<LanguageI> languages )
    {
        System.out.println( "List of languages" );
        for( LanguageI language : languages )
        {
            System.out.println( "------" );
            language.sayHello( );
            language.sayGoodbye( );
        }
    }
}
