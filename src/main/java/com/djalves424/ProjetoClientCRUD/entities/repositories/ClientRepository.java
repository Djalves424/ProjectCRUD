package com.djalves424.ProjetoClientCRUD.entities.repositories;

import com.djalves424.ProjetoClientCRUD.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
