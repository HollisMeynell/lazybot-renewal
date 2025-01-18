package me.aloic.lazybot.shiro.listener;

import com.mikuac.shiro.annotation.GroupMessageHandler;
import com.mikuac.shiro.annotation.common.Shiro;
import com.mikuac.shiro.common.utils.ShiroUtils;
import com.mikuac.shiro.core.Bot;
import com.mikuac.shiro.dto.event.message.GroupMessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Shiro
@Component
public class CommandListener
{
    private static final Logger logger = LoggerFactory.getLogger(CommandListener.class);

    @GroupMessageHandler
    public void onSlashCommandInteraction(Bot bot, GroupMessageEvent event) {
        logger.trace("收到消息[{}] -> {}", event.getGroupId(), ShiroUtils.unescape(event.getRawMessage()));
    }

}


