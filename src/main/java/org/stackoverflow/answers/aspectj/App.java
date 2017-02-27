package org.stackoverflow.answers.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.stackoverflow.answers.aspectj.configuration.AppConfig;
import org.stackoverflow.answers.aspectj.domain.LanguageEnglish;
import org.stackoverflow.answers.aspectj.domain.LanguageFactory;
import org.stackoverflow.answers.aspectj.domain.LanguageSpanish;
import org.stackoverflow.answers.aspectj.domain.Languages;

public class App
{
    public static void main( String[ ] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext( AppConfig.class );

        LanguageFactory factory = ctx.getBean( LanguageFactory.class );

        final LanguageSpanish spanish = factory.getSpanish( );
        spanish.sayGoodbye( );

        final LanguageEnglish english = (LanguageEnglish) factory.getLanguage( Languages.ENGLISH );
        english.sayGoodbye( );

        factory.getAll( );
    }
}
