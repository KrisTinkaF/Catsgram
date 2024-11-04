package ru.yandex.practicum.catsgram.model;

import java.time.Instant;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = { "email" })
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Instant registrationDate;

}
