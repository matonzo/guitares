package fr.sma.back.guitare.domain;

import lombok.Data;
import org.springframework.data.domain.Auditable;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Abstract Entity
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_seq")
    private Long id;

    @Version
    private int version;
}

