package ru.netology.domain.wallpostdetails;

public class AttachmentsInfo {
    /**
     * нужно изучить конструктор переменных
     * Может принимать значения: photo, audio, video, note, doc, graffiti, link, app, poll, page, album,
     * photoList, market, marketAlbum, sticker, event, prettyCards
     */
    private String attachmentType;     // тип вложения
    private String attachmentName;     // название (имя) вложения
    private boolean accept;            // приватность. Имеет ли доступ текущий пользователь


}
