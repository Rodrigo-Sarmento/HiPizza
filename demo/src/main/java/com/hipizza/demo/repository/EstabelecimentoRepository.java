package com.hipizza.demo.repository;

import com.hipizza.demo.domain.Estabelecimento;
import com.hipizza.demo.projection.EstabelecimentoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
    List<EstabelecimentoProjection> findAllBy();

}
