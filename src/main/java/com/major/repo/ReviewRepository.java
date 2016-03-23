package com.major.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.major.model.Review;

@RepositoryRestResource(collectionResourceRel = "review", path = "review")
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
	
	/* REST call to search by property id would look like
	 * http://localhost:8080/review/search/findByPropertyId?propertyId=1
	 */
	List<Review> findByPropertyId(@Param("propertyId") long propertyId);

}