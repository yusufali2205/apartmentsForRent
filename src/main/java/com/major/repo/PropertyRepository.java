package com.major.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.major.model.AverageReview;
import com.major.model.Property;
import com.major.model.Review;

@RepositoryRestResource(collectionResourceRel = "property", path = "property")
public interface PropertyRepository extends PagingAndSortingRepository<Property, Long> {
	
	/* REST call to search by property type would look like
	 * http://localhost:8080/property/search/findByType?type=apt
	 */
	List<Property> findByUserId(@Param("userId") long userId);
	List<Property> findByType(@Param("type") String type);
	List<Property> findByPropertyNameAllIgnoreCase(@Param("propertyName") String propertyName);
	List<Property> findByPriceBetween(@Param("min") int min, @Param("max") int max);
	List<Property> findByAvailableFromGreaterThan(@Param("availableFrom") Date availableFrom);
	List<Property> findByBhk(@Param("Bhk") int bhk);
	
	/* Search a property by all criteria */
	@Query("select p from Property p where p.price between :priceMin and :priceMax "
			+ "AND p.availableFrom >= :availableFrom AND p.type like %:type% AND p.bhk = :bhk "
			+ "AND ( p.propertyName like %:propertyName% OR p.address like %:address% )")
	List<Property> findByPriceBetweenAndAvailableFromGreaterThanEqualAndTypeAndBhkAndPropertyNameIgnoreCaseOrAddressIgnoreCase(
			@Param("priceMin") int priceMin, @Param("priceMax") int priceMax, @Param("availableFrom") Date availableFrom, 
			@Param("type") String type, @Param("bhk") int bhk, @Param("propertyName") String propertyName, @Param("address") String address);
	
	@Query("select p from Property p where p.address like %:address%")
	List<Property> findByAddress(@Param("address") String address);
	
	/* Search by all criteria */
	/*@Query("select p from Property p where LOWER(p.propertyName) like LOWER(%:propertyName%) "
			+ "AND price between :min and :max AND availableFrom >= :availableFrom AND bhk = :bhk "
			+ "AND type = :type")*/
	List<Property> findByPropertyNameAndPriceBetweenAndAvailableFromGreaterThanEqualAndBhkAndType(@Param("propertyName") String propertyName, 
			@Param("min") int min, @Param("max") int max, 
			@Param("availableFrom") Date availableFrom, @Param("bhk") int bhk,
			@Param("type") String type);
	
	/*
	@Query(value = "select p.property_id as propertyId, p.user_id as avgRating, "
			+ "p.geo_lat ratingCount from property p", nativeQuery = true)
	List<AverageReview> getAllProperty();
	*/
	/*
	@Query("select p, AVG(r.rating) as avgRating, "
			+ "COUNT(r) as ratingCount from Property p, Review r "
			+ "where p.propertyId = r.propertyId group by r.propertyId")
	List<Object[]> getAllProperty();
	*/
	
	@Query("select r from Property p, Review r where p.propertyId = r.propertyId "
			+ "and p.propertyId = :propertyId")
	List<Review> getReviewsByPropertyId(@Param("propertyId") long propertyId);

	@Query("select r from Property p, Review r where p.propertyId = r.propertyId "
			+ "and p.propertyId = :propertyId and r.userId = :userId")
	List<Review> getReviewsByPropertyIdAndUserId(@Param("propertyId") long propertyId, @Param("userId") long userId);
	
	@Query("select AVG(r.rating) from Property p, Review r where p.propertyId = r.propertyId "
			+ "and p.propertyId = :propertyId group by r.propertyId")
	long getAverageRating(@Param("propertyId") long propertyId);
	
	@Query("select COUNT(p) from Property p where p.placeId = :placeId")
	int checkPropertyByPlaceId(@Param("placeId") String placeId);
	
	
}