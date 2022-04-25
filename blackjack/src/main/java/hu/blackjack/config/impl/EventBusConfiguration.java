package hu.blackjack.config.impl;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventBusConfiguration {

    @Bean
    EventBus eventBus(){
        return new EventBus();
    }
}
