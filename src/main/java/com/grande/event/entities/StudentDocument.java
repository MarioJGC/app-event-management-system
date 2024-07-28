package com.grande.event.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "students_documents")
public class StudentDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String fileName;
    String fileType;
    byte[] data;
    LocalDateTime uploadTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    Event event;
}
