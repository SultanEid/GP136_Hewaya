package com.hewayah.hello_world.entity;

import lombok.Data;

//import javax.persistence.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "message")
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int messageId;

    @Column(name = "chat_id")
    private int chatId;

    @Column(name = "sender_username")
    private String senderUsername;

    @Column(name = "contect", columnDefinition = "text")
    private String content;

    @Column(name = "sent_date")
    private LocalDateTime sentDate;


}