package me.aloic.lazybot.config;

import me.aloic.lazybot.monitor.ResourceMonitor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializeConfig  implements ApplicationRunner
{

    @Override
    public void run(ApplicationArguments args)
    {
        ResourceMonitor.initResources();
    }
}
