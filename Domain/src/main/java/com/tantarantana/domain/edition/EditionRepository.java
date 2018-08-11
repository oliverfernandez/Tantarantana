package com.tantarantana.domain.edition;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditionRepository extends CrudRepository<Edition, Long> {
}
