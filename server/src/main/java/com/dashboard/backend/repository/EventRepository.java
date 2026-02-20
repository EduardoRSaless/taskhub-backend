package com.dashboard.backend.repository;

import com.dashboard.backend.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
    List<Event> findByCreatedBy(UUID createdBy);
}
