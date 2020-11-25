package ru.netology.domain.wallpostdetails;

public class CommentsInfo {
    private int commentCounter;         // счётчик комментариев
    private boolean canPost;            // может ли текущий пользователь публиковать комментарии
    private boolean groupsCanPost;      // могут ли сообщества комментировать запись
    private boolean canOpen;           // может ли текущий пользователь открыть комментарий к записи
    private boolean canClose;           // может ли текущий пользователь закрыть комментарий к записи
}
