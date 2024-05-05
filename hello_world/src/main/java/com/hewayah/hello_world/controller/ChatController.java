package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.Chat;
import com.hewayah.hello_world.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chats")
public class ChatController {
    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping
    public ResponseEntity<List<Chat>> getAllChats() {
        List<Chat> chats = chatService.getAllChats();
        return ResponseEntity.ok(chats);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chat> getChatById(@PathVariable Long id) {
        Optional<Chat> chat = chatService.getChatById(id);
        return chat.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Chat> createChat(@Valid @RequestBody Chat chat) {
        Chat createdChat = chatService.createChat(chat);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdChat);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateChat(@PathVariable Long id, @Validated @RequestBody Chat updatedChat) {
        chatService.updateChat(id, updatedChat);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChat(@PathVariable Long id) {
        chatService.deleteChat(id);
        return ResponseEntity.noContent().build();
    }
}