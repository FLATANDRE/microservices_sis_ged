package com.sgedblk.metadadosdocumentos.service.impl;

import com.sgedblk.metadadosdocumentos.entity.DocumentMetadata;
import com.sgedblk.metadadosdocumentos.repository.DocumentMetadataRepository;
import com.sgedblk.metadadosdocumentos.service.DocumentMetadataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DocumentMetadataServiceImpl implements DocumentMetadataService {
    private DocumentMetadataRepository documentMetadataRepository;

    @Override
    public DocumentMetadata findByDocCID(String docCID) {
        return documentMetadataRepository.findByDocCID(docCID);
    }

    @Override
    public List<DocumentMetadata> findByUser(String user) {
       return documentMetadataRepository.findByUser(user);
    }

    @Override
    public DocumentMetadata saveOrUpdate(DocumentMetadata documentMetadata) {
        return documentMetadataRepository.save(documentMetadata);
    }

    @Override
    public void deleteDocumentMetadataByCID(String docCID) {
        documentMetadataRepository.deleteByDocCID(docCID);
    }
}
