package com.example.test.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "notification", path = "notification")
public interface NotificationRepository extends PagingAndSortingRepository<Notification,Long> {
}
