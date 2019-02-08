package tech.thursday.tech.generics;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Long>{

}
