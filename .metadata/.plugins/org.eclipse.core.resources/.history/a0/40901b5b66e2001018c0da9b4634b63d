package com.binarydevs.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.binarydevs.Entities.AdminUser;

@Repository
public interface AdminRepository extends MongoRepository<AdminUser, String>{

	public AdminUser findByEmail(String username);

}
