package pl.bialek.kafkademo.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicConfiguration {
    @Bean
    public NewTopic firstTopic() {
        return TopicBuilder.name("firstTopic")
                .build();
    }
}
