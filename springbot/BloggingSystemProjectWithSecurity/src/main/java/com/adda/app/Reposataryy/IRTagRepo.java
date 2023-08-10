/**
 * 
 */
package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.Tag;

/**
 * @author sheetal
 *
 */
public interface IRTagRepo extends JpaRepository<Tag, Integer> {

}
