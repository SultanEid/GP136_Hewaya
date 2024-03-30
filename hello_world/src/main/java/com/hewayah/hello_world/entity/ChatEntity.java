package com.hewayah.hello_world.entity;
import lombok.Data;

//import javax.persistence.*;
import jakarta.persistence.*;
@Data

@Entity
@Table(name = "chats")
public class ChatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "service_provider_username")
    private String serviceProviderUsername;

    @Column(name = "hobbyist_username")
    private String hobbyistUsername;


}