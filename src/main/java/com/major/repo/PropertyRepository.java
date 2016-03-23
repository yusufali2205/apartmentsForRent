package com.major.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.major.model.Property;

@RepositoryRestResource(collectionResourceRel = "property", path = "property")
public interface PropertyRepository extends PagingAndSortingRepository<Property, Long> {
	
	/* REST call to search by property type would look like
	 * http://localhost:8080/property/search/findByType?type=apt
	 */
	List<Property> findByType(@Param("type") String type);
	List<Property> findByPropertyNameAllIgnoreCase(@Param("propertyName") String propertyName);
	List<Property> findByPriceBetween(@Param("min") int min, @Param("max") int max);
	List<Property> findByAvailableFromGreaterThan(@Param("availableFrom") Date availableFrom);
	List<Property> findByBhk(@Param("Bhk") int bhk);

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
}