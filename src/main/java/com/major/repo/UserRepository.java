package com.major.repo;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.major.model.User;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	List<User> findByLastName(@Param("name") String name);
	User findByPhoneNo(@Param("phoneNo") long phoneNo);
	User findByUserId(@Param("userId") long userId);
	User findByEmail(@Param("email") String email);
	User save(User user);

}