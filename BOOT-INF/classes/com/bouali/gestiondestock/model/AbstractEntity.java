package com.bouali.gestiondestock.model;

import java.io.*;
import org.springframework.data.jpa.domain.support.*;
import java.time.*;
import javax.persistence.*;
import org.springframework.data.annotation.*;

@MappedSuperclass
@EntityListeners({ AuditingEntityListener.class })
public class AbstractEntity implements Serializable
{
    @Id
    @GeneratedValue
    private Integer id;
    @CreatedDate
    @Column(name = "creationDate", nullable = false, updatable = false)
    private Instant creationDate;
    @LastModifiedDate
    @Column(name = "lastModifiedDate")
    private Instant lastModifiedDate;
    
    public Integer getId() {
        return this.id;
    }
    
    public Instant getCreationDate() {
        return this.creationDate;
    }
    
    public Instant getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setCreationDate(final Instant creationDate) {
        this.creationDate = creationDate;
    }
    
    public void setLastModifiedDate(final Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AbstractEntity)) {
            return false;
        }
        final AbstractEntity other = (AbstractEntity)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0065: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0065;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$creationDate = this.getCreationDate();
        final Object other$creationDate = other.getCreationDate();
        Label_0102: {
            if (this$creationDate == null) {
                if (other$creationDate == null) {
                    break Label_0102;
                }
            }
            else if (this$creationDate.equals(other$creationDate)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$lastModifiedDate = this.getLastModifiedDate();
        final Object other$lastModifiedDate = other.getLastModifiedDate();
        if (this$lastModifiedDate == null) {
            if (other$lastModifiedDate == null) {
                return true;
            }
        }
        else if (this$lastModifiedDate.equals(other$lastModifiedDate)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AbstractEntity;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $creationDate = this.getCreationDate();
        result = result * 59 + (($creationDate == null) ? 43 : $creationDate.hashCode());
        final Object $lastModifiedDate = this.getLastModifiedDate();
        result = result * 59 + (($lastModifiedDate == null) ? 43 : $lastModifiedDate.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/time/Instant;Ljava/time/Instant;)Ljava/lang/String;, this.getId(), this.getCreationDate(), this.getLastModifiedDate());
    }
}