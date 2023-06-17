package com.sgedblk.metadadosdocumentos.service.impl;

import com.sgedblk.metadadosdocumentos.entity.DocumentMetadata;
import com.sgedblk.metadadosdocumentos.repository.DocumentMetadataRepository;
import com.sgedblk.metadadosdocumentos.service.DocumentMetadataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Service
public class DocumentMetadataServiceImpl implements DocumentMetadataService {
    private DocumentMetadataRepository documentMetadataRepository;

    @Override
    public DocumentMetadata findByDocCID(String docCID) {
        return new DocumentMetadata("as3dasd213","ldsfjskidf324324","sdgsgsdf2323trsdg","teste.doc", LocalDateTime.now(),1);
    }

    @Override
    public List<DocumentMetadata> findByUser(String user) {
        DocumentMetadata doc = new DocumentMetadata("as3dasd213","ldsfjskidf324324","sdgsgsdf2323trsdg","teste.doc",LocalDateTime.now(),1);
        return List.of(doc);
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
