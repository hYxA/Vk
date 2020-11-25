package ru.netology.domain;

import ru.netology.domain.wallpostdetails.*;

import java.sql.Time;
import java.util.Date;

public class WallPost {

    private int id;                 // идентификатор поста
    private int ownerId;            // идентификатор владельца стены
    private int fromId;             // идентификатор автора записи
    private int createdBy;          // идентификатор администратора (для сообществ)
    private Date date;              // дата размещения записи............................возможно неправильный тип
    private Time time;              // время размещения записи...........................возможно неправильный тип
    private String body;            // основное тело поста со всеми картинками, ссылками и тд
    private int replyOwnerId;       // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;        // идентификатор записи, в ответ на которую была оставлена текущая
    private boolean favourites;     // добавлено в избранное
    private int views;              // количество просмотров
    private boolean accept;         // приватность. Может ли текущий пользователь видеть пост
    private RepostInfo repostInfo;  // может ли текущий пользователь сделать репост этой записи
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private AttachmentsInfo attachmentsInfo;
    private GeoInfo geoInfo;
}
