package com.hewayah.hello_world.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int messageId;


    @Column(name = "content", columnDefinition = "text")
    private String content;

    @Column(name = "sent_date")
    private LocalDateTime sentDate;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

}