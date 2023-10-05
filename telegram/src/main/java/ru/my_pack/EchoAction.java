package ru.my_pack;

import lombok.AllArgsConstructor;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@AllArgsConstructor
public class EchoAction implements Action {

    private final String action;

    @Override
    public BotApiMethod handle(Update update) {
        var msg = update.getMessage();
        var chatId = msg.getChatId().toString();
        var text = "Input any text";
        return new SendMessage(chatId, text);
    }

    @Override
    public BotApiMethod callBack(Update update) {
        var msg = update.getMessage();
        var chatId = msg.getChatId().toString();
        var text = "Action: " + action + ", data:" + msg.getText();
        return new SendMessage(chatId, text);
    }
}
