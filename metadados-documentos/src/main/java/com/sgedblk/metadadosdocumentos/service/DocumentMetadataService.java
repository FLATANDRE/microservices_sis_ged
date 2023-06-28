package com.sgedblk.metadadosdocumentos.service;

import com.sgedblk.metadadosdocumentos.entity.DocumentMetadata;

import java.util.List;

public interface DocumentMetadataService {

    DocumentMetadata findByDocCID(String docCID);
    List<DocumentMetadata> findByUser(String user);
    DocumentMetadata insertDefaultValuesAndSave(DocumentMetadata documentMetadata);
    DocumentMetadata saveOrUpdate(DocumentMetadata documentMetadata);
    void deleteDocumentMetadataByCID(String CID);
}
