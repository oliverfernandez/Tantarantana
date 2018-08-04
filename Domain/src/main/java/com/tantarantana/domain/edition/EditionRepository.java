package com.tantarantana.domain.edition;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

@Component
@RepositoryRestResource(collectionResourceRel = "editions", path = "editions")
public interface EditionRepository extends PagingAndSortingRepository<Edition, Long> {
}
