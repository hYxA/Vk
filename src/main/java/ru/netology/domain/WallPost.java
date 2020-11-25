package ru.netology.domain;

import javax.swing.*;
import java.sql.Time;
import java.util.Date;

public class WallPost {

    private int id;             // идентификатор поста
    private int ownerId;        // идентификатор владельца стены
    private int fromId;         // идентификатор автора записи
    private int createdBy;      // идентификатор администратора (для сообществ)
    private Date date;          // возможно неправильный тип
    private Time time;          // возможно неправильный тип
    private String body;        // основное тело поста со всеми картинками, ссылками и тд
    private int replyOwnerId;   // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;    // идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly;    // метка "Только для друзей"
    private boolean favourites; // добавлено в избранное
    private int likes;          // количество лайков
    private int views;          // количество просмотров
    private boolean accept;     // приватность
    private CommentsInfo commentsInfo;
}
