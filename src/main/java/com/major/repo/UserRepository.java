package com.major.repo;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.major.model.User;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	User findByEmail(@Param("email") String email);
	User findByPhoneNo(@Param("phoneNo") long phoneNo);
	User findByUserId(@Param("userId") long userId);
}