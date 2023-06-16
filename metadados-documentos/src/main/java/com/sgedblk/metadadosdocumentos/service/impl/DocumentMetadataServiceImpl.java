package com.sgedblk.metadadosdocumentos.service.impl;

import com.sgedblk.metadadosdocumentos.entity.DocumentMetadata;
import com.sgedblk.metadadosdocumentos.repository.DocumentMetadataRepository;
import com.sgedblk.metadadosdocumentos.service.DocumentMetadataService;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
public class DocumentMetadataServiceImpl implements DocumentMetadataService {
    private DocumentMetadataRepository documentMetadataRepository;

    @Override
    public DocumentMetadata findByDocCID(String docCID) {
        return new DocumentMetadata("as3dasd213","ldsfjskidf324324","sdgsgsdf2323trsdg","teste.doc",new Date(),1);
    }

    @Override
    public List<DocumentMetadata> findByUser(String user) {
        return null;
    }
}
