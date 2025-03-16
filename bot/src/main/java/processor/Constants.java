package processor;

public class Constants {

    public final static String START_MESSAGE = "Привет!";
    public final static String DEFAULT_MESSAGE = "Упс, какая-то не ожиданная команда!";
    public final static String EMPTY_LIST_MESSAGE = "У вас нету никаких ссылок!";
    public final static String SUCCESSFUL_TRACK_MESSAGE = "Ссылка успешно затрекана!";
    public final static String SUCCESSFUL_UNTRACK_MESSAGE = "Ссылка успешно откреплена!";
    public final static String FAIL_TRACK_MESSAGE = "Не верный форма ввода!\nНапишите: /track url";
    public final static String FAIL_UNTRACK_MESSAGE = "Не верный форма ввода!\nНапишите: /untrack url";
    public final static String HELP_MESSAGE = "/start -- зарегистрировать пользователя\n"
        + "/help -- вывести окно с командами\n"
        + "/track -- начать отслеживание ссылки\n"
        + "/untrack -- прекратить отслеживание ссылки\n"
        + "/list -- показать список отслеживаемых ссылок";

    private Constants() {

    }

}
