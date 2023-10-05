package ru.my_pack;

import lombok.AllArgsConstructor;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@AllArgsConstructor
public class InfoAction implements Action {

    private final List<String> actions;
    @Override
    public BotApiMethod handle(Update update) {
        var msg = update.getMessage();
        var chatId = msg.getChatId().toString();
        var out = new StringBuilder();
        out.append("Выберете действие").append("\n");
        for (String action : actions) {
            out.append(action).append("\n");
        }
        return new SendMessage(chatId, out.toString());
    }

    @Override
    public BotApiMethod callBack(Update update) {
        return handle(update);
    }
}
