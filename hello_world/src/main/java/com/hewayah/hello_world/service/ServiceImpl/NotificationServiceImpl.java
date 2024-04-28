package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.NotificationDTO;
import com.hewayah.hello_world.model.entity.Notification;
import com.hewayah.hello_world.model.entity.ServiceProvider;
import com.hewayah.hello_world.model.mapper.NotificationMapper;
import com.hewayah.hello_world.repository.NotificationRepository;
import com.hewayah.hello_world.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NotificationServiceImpl implements NotificationService {
    private final NotificationRepository notificationRepository;
    private final NotificationMapper notificationMapper;

    @Autowired
    public NotificationServiceImpl(NotificationRepository notificationRepository, NotificationMapper notificationMapper) {
        this.notificationRepository = notificationRepository;
        this.notificationMapper = notificationMapper;
    }

    @Override
    public NotificationDTO createNotification(NotificationDTO notificationDTO) {
        Notification notification = notificationMapper.toEntity(notificationDTO);
        Notification savedNotification = notificationRepository.save(notification);
        return notificationMapper.toDTO(savedNotification);
    }

    @Override
    public NotificationDTO updateNotification(int id, NotificationDTO notificationDTO) {
        return null;
    }
/*
    @Override
    public NotificationDTO updateNotification(int id, NotificationDTO notificationDTO) {
        Optional<Notification> optionalNotification = notificationRepository.findById(id);
        if (optionalNotification.isPresent()) {
            Notification notification = optionalNotification.get();
            notification.setSenderUsername(notificationDTO.getSenderUsername());
            notification.setReceiverUsername(notificationDTO.getReceiverUsername());
            notification.setNotificationType(notificationDTO.getNotificationType());
            notification.setNotificationMessage(notificationDTO.getNotificationMessage());
            // Set the ServiceProvider entity based on the serviceProviderId in the DTO
            ServiceProvider serviceProvider = new ServiceProvider();
            serviceProvider.setId(notificationDTO.getServiceProviderId());
            notification.setServiceProvider(serviceProvider);

            Notification updatedNotification = notificationRepository.save(notification);
            return notificationMapper.toDTO(updatedNotification);
        }
        return null;
    }

 */

    @Override
    public void deleteNotification(int id) {
        notificationRepository.deleteById(id);
    }

    @Override
    public NotificationDTO getNotificationById(int id) {
        Optional<Notification> optionalNotification = notificationRepository.findById(id);
        return optionalNotification.map(notificationMapper::toDTO).orElse(null);
    }

    @Override
    public List<NotificationDTO> getAllNotifications() {
        List<Notification> notifications = notificationRepository.findAll();
        return notifications.stream()
                .map(notificationMapper::toDTO)
                .collect(Collectors.toList());
    }
}