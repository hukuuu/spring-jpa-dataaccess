package org.hukuuu.com.dao;

import org.hukuuu.com.domain.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventDao extends CrudRepository<Event, Long> {

}
