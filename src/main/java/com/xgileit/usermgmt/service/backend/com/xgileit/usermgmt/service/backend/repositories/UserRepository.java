package com.xgileit.usermgmt.service.backend.com.xgileit.usermgmt.service.backend.repositories;

import com.xgileit.usermgmt.service.backend.com.xgileit.usermgmt.service.backend.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<User,Long>{
}
