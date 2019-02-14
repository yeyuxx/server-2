package org.bytedesk.jpa.repository;

import org.bytedesk.jpa.model.QuestionnaireItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bytedesk.com
 */
@Repository
public interface QuestionnaireItemRepository extends JpaRepository<QuestionnaireItem, Long> {

}