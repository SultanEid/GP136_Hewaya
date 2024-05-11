package com.hewayah.hello_world.entity;
import lombok.Data;

//import javax.persistence.*;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data

@Entity
@Table(name = "chats")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    private Long Id;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime dateCreate;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_provider_id")
    private ServiceProvider serviceProvider;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hobbyist_id")
    private Hobbyist hobbyist ;


    @OneToMany(mappedBy = "chat" ,cascade = CascadeType.ALL)
    private List<Message>  message;
}