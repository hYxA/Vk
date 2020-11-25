package ru.netology.domain;

import ru.netology.domain.wallpostdetails.*;

import java.sql.Time;
import java.util.Date;

public class WallPost {

    private int id;                 // идентификатор поста
    private int ownerId;            // идентификатор владельца стены
    private int fromId;             // идентификатор автора записи
    private int createdBy;          // идентификатор администратора (для сообществ)
    private int replyOwnerId;       // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;        // идентификатор записи, в ответ на которую была оставлена текущая
    private int postPonedId;        // идентификатор отложенной записи
    private int views;              // количество просмотров

    private boolean favourites;     // добавлено в избранное
    private boolean accept;         // приватность. Может ли текущий пользователь видеть пост
    private boolean canPin;         // может ли пользователь закрепить запись
    private boolean canEdit;        // может ли пользователь редактировать запись
    private boolean canDelete;      // может ли пользователь удалить запись
    private boolean isPinned;       // пост закреплен
    private boolean withAds;        // присутствует реклама

    private Date date;              // дата размещения записи............................возможно неправильный тип
    private Time time;              // время размещения записи...........................возможно неправильный тип
    private String body;            // основное тело поста со всеми картинками, ссылками и тд

    private RepostInfo repostInfo;  // может ли текущий пользователь сделать репост этой записи
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private AttachmentsInfo attachmentsInfo;
    private GeoInfo geoInfo;
    private PostSource postSource;

}
