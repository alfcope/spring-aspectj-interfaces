package org.stackoverflow.answers.aspectj.domain;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LanguageFactory
{

    public LanguageI getLanguage( Languages language )
    {
        if( language.equals( Languages.SPANISH ) )
        {
            return new LanguageSpanish( );
        }

        return new LanguageEnglish( );
    }

    public List<LanguageI> getAll( )
    {
        return Arrays.asList( new LanguageEnglish( ),
                              new LanguageSpanish( ) );
    }

    // Below methods should not be present in a factory
    // Just for demonstration purpose
    public LanguageSpanish getSpanish( )
    {
        return new LanguageSpanish( );
    }

    public LanguageEnglish getEnglish( )
    {
        return new LanguageEnglish( );
    }
}
