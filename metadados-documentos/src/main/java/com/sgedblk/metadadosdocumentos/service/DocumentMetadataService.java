package com.sgedblk.metadadosdocumentos.service;

import com.sgedblk.metadadosdocumentos.entity.DocumentMetadata;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocumentMetadataService {

    DocumentMetadata findByDocCID(String docCID);
    List<DocumentMetadata> findByUser(String user);
}
