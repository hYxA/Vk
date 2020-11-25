package ru.netology.domain;

import javax.swing.*;
import java.sql.Time;
import java.util.Date;

public class WallPost {

    private int id;             // идентификатор поста
    private ImageIcon avatar;   // возможно неправильный тип
    private String nameOwner;   // owner потому что создатель поста мб как группа, так и страница (аккаунт)
    private Date date;          // возможно неправильный тип
    private Time time;          // возможно неправильный тип
    private String body;        // основное тело поста со всеми картинками, ссылками и тд
    private boolean favourites; // добавлено в избранное
    private int likes;          // количество лайков
    private int comments;       // количество комментариев
    private int views;          // количество просмотров
    private boolean accept;     // приватность
}
