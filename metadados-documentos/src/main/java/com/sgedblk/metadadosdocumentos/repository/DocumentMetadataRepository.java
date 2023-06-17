package com.sgedblk.metadadosdocumentos.repository;

import com.sgedblk.metadadosdocumentos.entity.DocumentMetadata;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentMetadataRepository extends MongoRepository<DocumentMetadata, String> {

    void deleteByDocCID(String docCID);
}
