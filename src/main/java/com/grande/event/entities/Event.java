package com.grande.event.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;
    String description;
    LocalDateTime startTime;
    LocalDateTime endTime;
    String location;

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;

    @OneToMany(mappedBy = "event")
    Set<Registration> registrations;

    @OneToMany(mappedBy = "event")
    Set<Notification> notifications;

    @OneToMany(mappedBy = "event")
    Set<Comment> comments;

    @OneToMany(mappedBy = "event")
    Set<StudentDocument> studentDocuments;

}
