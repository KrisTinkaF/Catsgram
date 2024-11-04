package ru.yandex.practicum.catsgram.model;

import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
public class Post {
    private Long id;
    private long authorId;
    private String description;
    private Instant postDate;
}
