package com.xoyo.knights.config;

import com.xoyo.knights.BraveKnight;
import com.xoyo.knights.Knight;
import com.xoyo.knights.Quest;
import com.xoyo.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
